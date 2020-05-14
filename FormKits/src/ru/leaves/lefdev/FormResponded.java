package ru.leaves.lefdev;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.utils.Config;

public class FormResponded implements Listener {

    Config cfg;

    public FormResponded(Config cf) {
        this.cfg = cf;
    }

    @EventHandler
    public void onResp(PlayerFormRespondedEvent e) {
        Player p = e.getPlayer();
        if (e.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple form = (FormWindowSimple) e.getWindow();
            if (e.getResponse() == null) return;
            String button = form.getResponse().getClickedButton().getText();
            if (!e.wasClosed()) {
                switch (form.getTitle()) {
                    //Меню
                    case "§l §7Kits":
                        switch (button) {
                            case "§l§8Стартовый набор":
                                if(this.cfg.get(p.getName()) == null) {
                                    if(!p.isOp()) this.cfg.set(p.getName(), true);
                                    Item sword = Item.get(272);
                                    sword.addEnchantment(Enchantment.get(16));
                                    p.getInventory().addItem(sword);
                                    p.getInventory().addItem(Item.get(273, 0, 1));
                                    p.getInventory().addItem(Item.get(274, 0, 1));
                                    p.getInventory().addItem(Item.get(275, 0, 1));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(17, 0, 16));
                                    p.getInventory().addItem(Item.get(364, 0, 16));
                                    p.getInventory().addItem(Item.get(322, 0, 2));
                                    p.getInventory().addItem(Item.get(20, 0, 32));
                                    p.getInventory().addItem(Item.get(50, 0, 16));
                                    p.getInventory().setChestplate(Item.get(299));

                                    p.sendMessage("§a>§f Стартовый набор был успешно выдан!");
                                    this.cfg.save(true);
                                } else {
                                    p.sendMessage("§4>§f Вы уже брали набор!");
                                }
                                break;
                            case "§l§8Бронзовый набор":
                                if(this.cfg.get(p.getName()) == null) {
                                    if(!p.isOp()) this.cfg.set(p.getName(), true);
                                    Item sword = Item.get(267);
                                    sword.addEnchantment(Enchantment.get(16));
                                    p.getInventory().addItem(sword);
                                    p.getInventory().addItem(Item.get(256, 0, 1));
                                    p.getInventory().addItem(Item.get(257, 0, 1));
                                    p.getInventory().addItem(Item.get(258, 0, 1));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(17, 0, 32));
                                    p.getInventory().addItem(Item.get(297, 0, 32));
                                    p.getInventory().addItem(Item.get(322, 0, 3));
                                    p.getInventory().addItem(Item.get(20, 0, 32));
                                    p.getInventory().addItem(Item.get(50, 0, 32));
                                    p.getInventory().setChestplate(Item.get(307));

                                    p.sendMessage("§a>§f Бронзовый набор был успешно выдан!");
                                    this.cfg.save(true);
                                } else {
                                    p.sendMessage("§4>§f Вы уже брали набор!");
                                }
                                break;
                            case "§l§8Серебрянный набор":
                                if(this.cfg.get(p.getName()) == null) {
                                    if(!p.isOp()) this.cfg.set(p.getName(), true);
                                    Item sword = Item.get(267);
                                    sword.addEnchantment(Enchantment.get(16).setLevel(1));
                                    sword.addEnchantment(Enchantment.get(19));
                                    p.getInventory().addItem(sword);
                                    p.getInventory().addItem(Item.get(256, 0, 1));
                                    p.getInventory().addItem(Item.get(257, 0, 1));
                                    p.getInventory().addItem(Item.get(258, 0, 1));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(17, 0, 64));
                                    p.getInventory().addItem(Item.get(320, 0, 32));
                                    p.getInventory().addItem(Item.get(322, 0, 9));
                                    p.getInventory().addItem(Item.get(20, 0, 64));
                                    p.getInventory().addItem(Item.get(50, 0, 32));
                                    p.getInventory().addItem(Item.get(368, 0, 1));
                                    Item chestplate = Item.get(307);
                                    chestplate.addEnchantment(Enchantment.get(0));
                                    p.getInventory().setChestplate(chestplate);

                                    p.sendMessage("§a>§f Серебрянный набор был успешно выдан!");
                                    this.cfg.save(true);
                                } else {
                                    p.sendMessage("§4>§f Вы уже брали набор!");
                                }
                                break;
                            case "§l§8Золотой набор":
                                if(this.cfg.get(p.getName()) == null) {
                                    if(!p.isOp()) this.cfg.set(p.getName(), true);
                                    Item sword = Item.get(276);
                                    sword.addEnchantment(Enchantment.get(16).setLevel(1));
                                    sword.addEnchantment(Enchantment.get(19));
                                    p.getInventory().addItem(sword);
                                    p.getInventory().addItem(Item.get(277, 0, 1));
                                    p.getInventory().addItem(Item.get(278, 0, 1));
                                    p.getInventory().addItem(Item.get(279, 0, 1));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(45, 0, 64));
                                    p.getInventory().addItem(Item.get(17, 0, 64));
                                    p.getInventory().addItem(Item.get(364, 0, 32));
                                    p.getInventory().addItem(Item.get(466, 0, 5));
                                    p.getInventory().addItem(Item.get(20, 0, 64));
                                    p.getInventory().addItem(Item.get(50, 0, 48));
                                    p.getInventory().addItem(Item.get(368, 0, 3));
                                    Item chestplate = Item.get(311);
                                    chestplate.addEnchantment(Enchantment.get(0));
                                    p.getInventory().setChestplate(chestplate);
                                    p.getInventory().setHelmet(Item.get(306));
                                    p.getInventory().setBoots(Item.get(309));
                                    p.getInventory().setLeggings(Item.get(308));

                                    p.sendMessage("§a>§f Золотой набор был успешно выдан!");
                                    this.cfg.save(true);
                                } else {
                                    p.sendMessage("§4>§f Вы уже брали набор!");
                                }
                                break;
                        }
                }
            }
        }
    }
}
