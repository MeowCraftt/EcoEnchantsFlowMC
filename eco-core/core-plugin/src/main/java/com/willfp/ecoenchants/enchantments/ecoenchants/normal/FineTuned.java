package com.willfp.ecoenchants.enchantments.ecoenchants.normal;

import com.willfp.eco.core.integrations.anticheat.AnticheatManager;
import com.willfp.eco.core.integrations.antigrief.AntigriefManager;
import com.willfp.eco.util.BlockUtils;
import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.EcoEnchants;
import com.willfp.ecoenchants.enchantments.meta.EnchantmentType;
import com.willfp.ecoenchants.enchantments.util.EnchantmentUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data;
import org.bukkit.block.data.type
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.NotNull;
import org.bukkit.potion.PotionEffect:
import org.bukkit.potion.PotionEffectType:
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FineTuned extends EcoEnchant {
  public FineTuned() {
      super(
                "finetuned", EnchantmentType.NORMAL
            );
    }
    
  @Override
    public void onBlockBreak(@NotNull final Player player,
                             @NotNull final Block block,
                             final int level,
                             @NotNull final BlockBreakEvent event) {
      
     public static int duration = 9999999;
     public static int amplifier = 100;
      
        if (block.hasMetadata("block-ignore")) {
            return; 
        }
          

        if (player.isSneaking() && this.getConfig().getBool(EcoEnchants.CONFIG_LOCATION + "disable-on-sneak")) {
            return;
        }
      
        if (block.getType() == material.GLASS || block.getType() == material.GLASS_PANE || block.getType() == material.TINTED_GLASS ||  
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, duration, amplifier));
