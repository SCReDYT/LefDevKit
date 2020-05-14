package ru.leaves.lefdev;

import cn.nukkit.Player;
import cn.nukkit.level.Position;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import ru.leaves.lefdev.FormResponded;
import ru.leaves.lefdev.Kits;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Bootstrap extends PluginBase {

    public HashMap<String, Position> deaths;
    public HashMap<String, Player> listTp;
    public Config cfg;
    public Config kits;
    public Config homes;

    @Override
    public void onEnable() {
        this.kits = new Config("plugins/kits.json", Config.JSON);
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int day = localDate.getDayOfMonth();
        if (this.kits.getInt("date") != day) {
            for (String val : kits.getAll().keySet()) {
                this.kits.remove(val);
            }
            this.kits.set("date", day);
            this.kits.save();
            getLogger().info("Текущая дата - " + day);
        }
        this.getServer().getPluginManager().registerEvents(new FormResponded(this.kits), this);
        this.registerCommands();
    }

    public void registerCommands() {
        this.getServer().getCommandMap().register("kit", new Kits(this.kits));
    }
}
