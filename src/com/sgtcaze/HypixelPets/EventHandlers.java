package com.sgtcaze.HypixelPets;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class EventHandlers extends PetMenu {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		if (p.getInventory().contains(Pets)) {
		} else {
			p.getInventory().addItem(Pets);
		}
	}
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent event) {
		if ((event.getItemDrop().getItemStack().equals(Pets)))
			event.setCancelled(true);
	}
	
	@EventHandler
	public void HypixelPets(PlayerInteractEvent event) {
		Player player = event.getPlayer();
	
	if (player.getInventory().getItemInHand().getType() == Material.BONE) {
		if (event.getAction() == Action.RIGHT_CLICK_AIR
				|| event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			player.openInventory(PetInv);
		}
	}
}

@EventHandler
public void Servers(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked();
	if(event.getInventory().getName().equals(PetInv.getName())){
	event.setCancelled(true);

	if (event.getCurrentItem() == null) {
		return;
	}
	if (event.getCurrentItem().equals(new ItemStack(Creeper))) {
		player.performCommand("pet creeper");
	}
	if (event.getCurrentItem().equals(new ItemStack(Skeleton))) {
		player.performCommand("pet skeleton");
	}
	if (event.getCurrentItem().equals(new ItemStack(Spider))) {
		player.performCommand("pet spider");
	}
	if (event.getCurrentItem().equals(new ItemStack(Zombie))) {
		player.performCommand("pet zombie");
	}
	if (event.getCurrentItem().equals(new ItemStack(Slime))) {
		player.performCommand("pet slime");
	}
	if (event.getCurrentItem().equals(new ItemStack(Ghast))) {
		player.performCommand("pet ghast");
	}
	if (event.getCurrentItem().equals(new ItemStack(ZombiePigMan))) {
		player.performCommand("pet pigzombie");
	}
	if (event.getCurrentItem().equals(new ItemStack(Enderman))) {
		player.performCommand("pet enderman");
	}
	if (event.getCurrentItem().equals(new ItemStack(CaveSpider))) {
		player.performCommand("pet cavespider");
	}
	if (event.getCurrentItem().equals(new ItemStack(Silverfish))) {
		player.performCommand("pet silverfish");
	}
	if (event.getCurrentItem().equals(new ItemStack(Blaze))) {
		player.performCommand("pet blaze");
	}
	if (event.getCurrentItem().equals(new ItemStack(MagmaCube))) {
		player.performCommand("pet magmacube");
	}
	if (event.getCurrentItem().equals(new ItemStack(Bat))) {
		player.performCommand("pet bat");
	}
	if (event.getCurrentItem().equals(new ItemStack(Witch))) {
		player.performCommand("pet witch");
	}
	if (event.getCurrentItem().equals(new ItemStack(Pig))) {
		player.performCommand("pet pig");
	}
	if (event.getCurrentItem().equals(new ItemStack(Sheep))) {
		player.performCommand("pet sheep");
	}
	if (event.getCurrentItem().equals(new ItemStack(Cow))) {
		player.performCommand("pet cow");
	}
	if (event.getCurrentItem().equals(new ItemStack(Chicken))) {
		player.performCommand("pet chicken");
	}
	if (event.getCurrentItem().equals(new ItemStack(Squid))) {
		player.performCommand("pet squid");
	}
	if (event.getCurrentItem().equals(new ItemStack(Wolf))) {
		player.performCommand("pet wolf");
	}
	if (event.getCurrentItem().equals(new ItemStack(MushroomCow))) {
		player.performCommand("pet mushroomcow");
	}
	if (event.getCurrentItem().equals(new ItemStack(Ocelot))) {
		player.performCommand("pet ocelot");
	}
	if (event.getCurrentItem().equals(new ItemStack(Horse))) {
		player.performCommand("pet horse");
	}
	if (event.getCurrentItem().equals(new ItemStack(Villager))) {
		player.performCommand("pet villager");
   }
	if (event.getCurrentItem().equals(new ItemStack(WhiteSheep))) {
		player.performCommand("pet sheep:white");
   }
	if (event.getCurrentItem().equals(new ItemStack(OrangeSheep))) {
		player.performCommand("pet sheep:orange");
   }
	if (event.getCurrentItem().equals(new ItemStack(MagentaSheep))) {
		player.performCommand("pet sheep:magenta");
   }
	if (event.getCurrentItem().equals(new ItemStack(LightBlueSheep))) {
		player.performCommand("pet sheep:lightblue");
   }
	if (event.getCurrentItem().equals(new ItemStack(YellowSheep))) {
		player.performCommand("pet sheep:yellow");
   }
	if (event.getCurrentItem().equals(new ItemStack(LimeSheep))) {
		player.performCommand("pet sheep:lime");
   }
	if (event.getCurrentItem().equals(new ItemStack(PinkSheep))) {
		player.performCommand("pet sheep:pink");
   }
	if (event.getCurrentItem().equals(new ItemStack(DarkGraySheep))) {
		player.performCommand("pet sheep:gray");
   }
	if (event.getCurrentItem().equals(new ItemStack(GraySheep))) {
		player.performCommand("pet sheep:silver");
   }
	if (event.getCurrentItem().equals(new ItemStack(CyanSheep))) {
		player.performCommand("pet sheep:cyan");
   }
	if (event.getCurrentItem().equals(new ItemStack(PurpleSheep))) {
		player.performCommand("pet sheep:purple");
   }
	if (event.getCurrentItem().equals(new ItemStack(BlueSheep))) {
		player.performCommand("pet sheep:blue");
   }
	if (event.getCurrentItem().equals(new ItemStack(BrownSheep))) {
		player.performCommand("pet sheep:brown");
   }
	if (event.getCurrentItem().equals(new ItemStack(GreenSheep))) {
		player.performCommand("pet sheep:green");
   }
	if (event.getCurrentItem().equals(new ItemStack(RedSheep))) {
		player.performCommand("pet sheep:red");
   }
	if (event.getCurrentItem().equals(new ItemStack(BlackSheep))) {
		player.performCommand("pet sheep:black");
   }
	if (event.getCurrentItem().equals(new ItemStack(IronGolem))) {
		player.performCommand("pet irongolem");
   }
	if (event.getCurrentItem().equals(new ItemStack(SnowMan))) {
		player.performCommand("pet snowman");
   }
  }
 }
}
