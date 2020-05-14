package ru.leaves.lefdev;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.element.ElementButtonImageData;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.utils.Config;

public class Kits extends Command {

    Config cfg;

    public Kits(Config c) {
        super("kit", "Использование китов", "/kit");
        this.commandParameters.clear();
        this.cfg = c;
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("§l§4>§f Используйте команду в игре!");
            return true;
        } else {
            Player p = (Player) sender;
            FormWindowSimple form = new FormWindowSimple("§l §7Kits", "");
            form.setContent("§l§e> §fВозможность брать киты - " + getAccess(p) + "\n\n"
            );

            //init buttons
            ElementButton
                    start = new ElementButton("§l§8Стартовый набор"),
                    bronze = new ElementButton("§l§8Бронзовый набор"),
                    silver = new ElementButton("§l§8Серебрянный набор"),
                    gold = new ElementButton("§l§8Золотой набор");

            //images for buttons
            start.addImage(new ElementButtonImageData("path", "textures/items/chainmail_helmet.png"));
            bronze.addImage(new ElementButtonImageData("path", "textures/items/leather_chestplate.png"));
            silver.addImage(new ElementButtonImageData("path", "textures/items/iron_leggings.png"));
            gold.addImage(new ElementButtonImageData("path", "textures/items/gold_boots.png"));

            //add buttons
            form.addButton(start);
            if(p.hasPermission("bronze")) form.addButton(bronze);
            if(p.hasPermission("silver")) form.addButton(silver);
            if(p.hasPermission("gold")) form.addButton(gold);

            p.showFormWindow(form);
        }
        return false;
    }

    public String getAccess(Player p) {
        //Access kit
        if(this.cfg.get(p.getName()) != null) {
            return "§eотсутствует";
        } else {
            return "§aприсутствует";
        }
    }
}
