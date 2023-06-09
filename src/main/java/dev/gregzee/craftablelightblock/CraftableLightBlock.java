package dev.gregzee.craftablelightblock;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftableLightBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        ItemStack lightblock = new ItemStack(Material.LIGHT);
        ItemMeta lightMeta = lightblock.getItemMeta();
        lightMeta.setDisplayName(getConfig().getString("lightblockName"));
        lightblock.setItemMeta(lightMeta);

        ShapedRecipe lightBlock = new ShapedRecipe(lightblock);

        lightBlock.shape("!@#", "$%^", "&*(");

        lightBlock.setIngredient('!', Material.getMaterial(getConfig().getString("1")));
        lightBlock.setIngredient('@', Material.getMaterial(getConfig().getString("2")));
        lightBlock.setIngredient('#', Material.getMaterial(getConfig().getString("3")));
        lightBlock.setIngredient('$', Material.getMaterial(getConfig().getString("4")));
        lightBlock.setIngredient('%', Material.getMaterial(getConfig().getString("5")));
        lightBlock.setIngredient('^', Material.getMaterial(getConfig().getString("6")));
        lightBlock.setIngredient('&', Material.getMaterial(getConfig().getString("7")));
        lightBlock.setIngredient('*', Material.getMaterial(getConfig().getString("8")));
        lightBlock.setIngredient('(', Material.getMaterial(getConfig().getString("9")));

        getServer().addRecipe(lightBlock);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
