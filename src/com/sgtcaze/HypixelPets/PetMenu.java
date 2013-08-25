package com.sgtcaze.HypixelPets;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PetMenu extends HypixelPets {
	
	    ItemStack Pets = new ItemStack(Material.BONE, 1);{
		ItemMeta PetMeta = Pets.getItemMeta();
		ArrayList<String> pets = new ArrayList<String>();
		PetMeta.setDisplayName(ChatColor.GREEN + "Pets");
		pets.add(ChatColor.GRAY + "Right click to open");
		PetMeta.setLore(pets);
		Pets.setItemMeta(PetMeta);
		}

		ItemStack Creeper = new ItemStack(Material.MONSTER_EGG, 1, (short) 50);{
		ItemMeta CreeperMeta = Creeper.getItemMeta();
		ArrayList<String> creeper = new ArrayList<String>();
		CreeperMeta.setDisplayName(ChatColor.RED + "Creeper Pet");
		//creeper.add(ChatColor.GRAY + "Regular Pet");
		CreeperMeta.setLore(creeper);
		Creeper.setItemMeta(CreeperMeta);
		}
		ItemStack Skeleton = new ItemStack(Material.MONSTER_EGG, 1, (short) 51);{
		ItemMeta SkeletonMeta = Skeleton.getItemMeta();
		ArrayList<String> skeleton = new ArrayList<String>();
		SkeletonMeta.setDisplayName(ChatColor.RED + "Skeleton Pet");
		//skeleton.add(ChatColor.GRAY + "Regular Pet");
		SkeletonMeta.setLore(skeleton);
		Skeleton.setItemMeta(SkeletonMeta);
		}
		ItemStack Spider = new ItemStack(Material.MONSTER_EGG, 1, (short) 52);{
		ItemMeta SpiderMeta = Spider.getItemMeta();
		ArrayList<String> spider = new ArrayList<String>();
		SpiderMeta.setDisplayName(ChatColor.RED + "Spider Pet");
		//spider.add(ChatColor.GRAY + "Regular Pet");
		SpiderMeta.setLore(spider);
		Spider.setItemMeta(SpiderMeta);
		}
		ItemStack Zombie = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);{
		ItemMeta ZombieMeta = Zombie.getItemMeta();
		ArrayList<String> zombie = new ArrayList<String>();
		ZombieMeta.setDisplayName(ChatColor.RED + "Zombie Pet");
		//zombie.add(ChatColor.GRAY + "Regular Pet");
		ZombieMeta.setLore(zombie);
		Zombie.setItemMeta(ZombieMeta);
		}
		ItemStack Slime = new ItemStack(Material.MONSTER_EGG, 1, (short) 55);{
		ItemMeta SlimeMeta = Slime.getItemMeta();
		ArrayList<String> slime = new ArrayList<String>();
		SlimeMeta.setDisplayName(ChatColor.RED + "Slime Pet");
		//slime.add(ChatColor.GRAY + "Regular Pet");
		SlimeMeta.setLore(slime);
		Slime.setItemMeta(SlimeMeta);
		}
		ItemStack Ghast = new ItemStack(Material.MONSTER_EGG, 1, (short) 56);{
		ItemMeta GhastMeta = Ghast.getItemMeta();
		ArrayList<String> ghast = new ArrayList<String>();
		GhastMeta.setDisplayName(ChatColor.RED + "Ghast Pet");
		//ghast.add(ChatColor.GRAY + "Regular Pet");
		GhastMeta.setLore(ghast);
		Ghast.setItemMeta(GhastMeta);
		}
		ItemStack ZombiePigMan = new ItemStack(Material.MONSTER_EGG, 1, (short) 57);{
		ItemMeta ZombiePigManMeta = ZombiePigMan.getItemMeta();
		ArrayList<String> zombiepigman = new ArrayList<String>();
		ZombiePigManMeta.setDisplayName(ChatColor.RED + "Zombie Pigman Pet");
		//zombiepigman.add(ChatColor.GRAY + "Regular Pet");
		ZombiePigManMeta.setLore(zombiepigman);
		ZombiePigMan.setItemMeta(ZombiePigManMeta);
		}
		ItemStack Enderman = new ItemStack(Material.MONSTER_EGG, 1, (short) 58);{
		ItemMeta EndermanMeta = Enderman.getItemMeta();
		ArrayList<String> enderman = new ArrayList<String>();
		EndermanMeta.setDisplayName(ChatColor.RED + "Enderman Pet");
		//enderman.add(ChatColor.GRAY + "Regular Pet");
		EndermanMeta.setLore(enderman);
		Enderman.setItemMeta(EndermanMeta);
		}
		ItemStack CaveSpider = new ItemStack(Material.MONSTER_EGG, 1, (short) 59);{
		ItemMeta CaveSpiderMeta = CaveSpider.getItemMeta();
		ArrayList<String> cavespider = new ArrayList<String>();
		CaveSpiderMeta.setDisplayName(ChatColor.RED + "Cave Spider Pet");
		//cavespider.add(ChatColor.GRAY + "Regular Pet");
		CaveSpiderMeta.setLore(cavespider);
		CaveSpider.setItemMeta(CaveSpiderMeta);
		}
		ItemStack Silverfish = new ItemStack(Material.MONSTER_EGG, 1, (short) 60);{
		ItemMeta SilverfishMeta = Silverfish.getItemMeta();
		ArrayList<String> silverfish = new ArrayList<String>();
		SilverfishMeta.setDisplayName(ChatColor.RED + "Silverfish Pet");
		//silverfish.add(ChatColor.GRAY + "Regular Pet");
		SilverfishMeta.setLore(silverfish);
		Silverfish.setItemMeta(SilverfishMeta);
		}
		ItemStack Blaze = new ItemStack(Material.MONSTER_EGG, 1, (short) 61);{
		ItemMeta BlazeMeta = Blaze.getItemMeta();
		ArrayList<String> blaze = new ArrayList<String>();
		BlazeMeta.setDisplayName(ChatColor.RED + "Blaze Pet");
		//blaze.add(ChatColor.GRAY + "Regular Pet");
		BlazeMeta.setLore(blaze);
		Blaze.setItemMeta(BlazeMeta);
		}
		ItemStack MagmaCube = new ItemStack(Material.MONSTER_EGG, 1, (short) 62);{
		ItemMeta MagmaCubeMeta = MagmaCube.getItemMeta();
		ArrayList<String> magmacube = new ArrayList<String>();
		MagmaCubeMeta.setDisplayName(ChatColor.RED + "Magma Cube Pet");
		//magmacube.add(ChatColor.GRAY + "Regular Pet");
		MagmaCubeMeta.setLore(magmacube);
		MagmaCube.setItemMeta(MagmaCubeMeta);
		}
		ItemStack Bat = new ItemStack(Material.MONSTER_EGG, 1, (short) 65);{
		ItemMeta BatMeta = Bat.getItemMeta();
		ArrayList<String> bat = new ArrayList<String>();
		BatMeta.setDisplayName(ChatColor.RED + "Bat Pet");
		//bat.add(ChatColor.GRAY + "Regular Pet");
		BatMeta.setLore(bat);
		Bat.setItemMeta(BatMeta);
		}
		ItemStack Witch = new ItemStack(Material.MONSTER_EGG, 1, (short) 66);{
		ItemMeta WitchMeta = Witch.getItemMeta();
		ArrayList<String> witch = new ArrayList<String>();
		WitchMeta.setDisplayName(ChatColor.RED + "Witch Pet");
		//witch.add(ChatColor.GRAY + "Regular Pet");
		WitchMeta.setLore(witch);
		Witch.setItemMeta(WitchMeta);
		}
		ItemStack Pig = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);{
		ItemMeta PigMeta = Pig.getItemMeta();
		ArrayList<String> pig = new ArrayList<String>();
		PigMeta.setDisplayName(ChatColor.RED + "Pig Pet");
		//pig.add(ChatColor.GRAY + "Regular Pet");
		PigMeta.setLore(pig);
		Pig.setItemMeta(PigMeta);
		}
		ItemStack Sheep = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);{
		ItemMeta SheepMeta = Sheep.getItemMeta();
		ArrayList<String> sheep = new ArrayList<String>();
		SheepMeta.setDisplayName(ChatColor.RED + "Sheep Pet");
		//sheep.add(ChatColor.GRAY + "Regular Pet");
		SheepMeta.setLore(sheep);
		Sheep.setItemMeta(SheepMeta);
		}
		ItemStack Cow = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);{
		ItemMeta CowMeta = Cow.getItemMeta();
		ArrayList<String> cow = new ArrayList<String>();
		CowMeta.setDisplayName(ChatColor.RED + "Cow Pet");
		//cow.add(ChatColor.GRAY + "Regular Pet");
		CowMeta.setLore(cow);
		Cow.setItemMeta(CowMeta);
		}
		ItemStack Chicken = new ItemStack(Material.MONSTER_EGG, 1, (short) 93);{
		ItemMeta ChickenMeta = Chicken.getItemMeta();
		ArrayList<String> chicken = new ArrayList<String>();
		ChickenMeta.setDisplayName(ChatColor.RED + "Chicken Pet");
		//chicken.add(ChatColor.GRAY + "Regular Pet");
		ChickenMeta.setLore(chicken);
		Chicken.setItemMeta(ChickenMeta);
		}
		ItemStack Squid = new ItemStack(Material.MONSTER_EGG, 1, (short) 94);{
		ItemMeta SquidMeta = Squid.getItemMeta();
		ArrayList<String> squid = new ArrayList<String>();
		SquidMeta.setDisplayName(ChatColor.RED + "Squid Pet");
		//squid.add(ChatColor.GRAY + "Regular Pet");
		SquidMeta.setLore(squid);
		Squid.setItemMeta(SquidMeta);
		}
		ItemStack Wolf = new ItemStack(Material.MONSTER_EGG, 1, (short) 95);{
		ItemMeta WolfMeta = Wolf.getItemMeta();
		ArrayList<String> wolf = new ArrayList<String>();
		WolfMeta.setDisplayName(ChatColor.RED + "Wolf Pet");
		//wolf.add(ChatColor.GRAY + "Regular Pet");
		WolfMeta.setLore(wolf);
		Wolf.setItemMeta(WolfMeta);
		}
		ItemStack MushroomCow = new ItemStack(Material.MONSTER_EGG, 1, (short) 96);{
		ItemMeta MushroomCowMeta = MushroomCow.getItemMeta();
		ArrayList<String> mushroomcow = new ArrayList<String>();
		MushroomCowMeta.setDisplayName(ChatColor.RED + "MushroomCow Pet");
		//mushroomcow.add(ChatColor.GRAY + "Regular Pet");
		MushroomCowMeta.setLore(mushroomcow);
		MushroomCow.setItemMeta(MushroomCowMeta);	
		}
		ItemStack Ocelot = new ItemStack(Material.MONSTER_EGG, 1, (short) 98);{
		ItemMeta OcelotMeta = Ocelot.getItemMeta();
		ArrayList<String> ocelot = new ArrayList<String>();
		OcelotMeta.setDisplayName(ChatColor.RED + "Ocelot Pet");
		//ocelot.add(ChatColor.GRAY + "Regular Pet");
		OcelotMeta.setLore(ocelot);
		Ocelot.setItemMeta(OcelotMeta);
		}
		ItemStack Horse = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);{
		ItemMeta HorseMeta = Horse.getItemMeta();
		ArrayList<String> horse = new ArrayList<String>();
		HorseMeta.setDisplayName(ChatColor.RED + "Horse Pet");
		//horse.add(ChatColor.GRAY + "Regular Pet");
		HorseMeta.setLore(horse);
		Horse.setItemMeta(HorseMeta);
		}
		ItemStack Villager = new ItemStack(Material.MONSTER_EGG, 1, (short) 120);{
		ItemMeta VillagerMeta = Villager.getItemMeta();
		ArrayList<String> villager = new ArrayList<String>();
		VillagerMeta.setDisplayName(ChatColor.RED + "Villager Pet");
		//villager.add(ChatColor.GRAY + "Regular Pet");
		VillagerMeta.setLore(villager);
		Villager.setItemMeta(VillagerMeta);
		}
		ItemStack WhiteSheep = new ItemStack(Material.WOOL, 1, (short) 0);{
		ItemMeta WhiteSheepMeta = WhiteSheep.getItemMeta();
		ArrayList<String> whitesheep = new ArrayList<String>();
		WhiteSheepMeta.setDisplayName(ChatColor.RED + "White Sheep Pet");
		//whitesheep.add(ChatColor.GRAY + "Regular Pet");
		WhiteSheepMeta.setLore(whitesheep);
		WhiteSheep.setItemMeta(WhiteSheepMeta);
		}
		ItemStack OrangeSheep = new ItemStack(Material.WOOL, 1, (short) 1);{
		ItemMeta OrangeSheepMeta = OrangeSheep.getItemMeta();
		ArrayList<String> orangesheep = new ArrayList<String>();
		OrangeSheepMeta.setDisplayName(ChatColor.RED + "Orange Sheep Pet");
		//orangesheep.add(ChatColor.GRAY + "Regular Pet");
		OrangeSheepMeta.setLore(orangesheep);
		OrangeSheep.setItemMeta(OrangeSheepMeta);
		}
		
		ItemStack MagentaSheep = new ItemStack(Material.WOOL, 1, (short) 2);{
		ItemMeta MagentaSheepMeta = MagentaSheep.getItemMeta();
		ArrayList<String> magentasheep = new ArrayList<String>();
		MagentaSheepMeta.setDisplayName(ChatColor.RED + "Magenta Sheep Pet");
		//magentasheep.add(ChatColor.GRAY + "Regular Pet");
		MagentaSheepMeta.setLore(magentasheep);
		MagentaSheep.setItemMeta(MagentaSheepMeta);
		}
		ItemStack LightBlueSheep = new ItemStack(Material.WOOL, 1, (short) 3);{
		ItemMeta LightBlueSheepMeta = LightBlueSheep.getItemMeta();
		ArrayList<String> lightbluesheep = new ArrayList<String>();
		LightBlueSheepMeta.setDisplayName(ChatColor.RED + "Light Blue Sheep Pet");
		//lightbluesheep.add(ChatColor.GRAY + "Regular Pet");
		LightBlueSheepMeta.setLore(lightbluesheep);
		LightBlueSheep.setItemMeta(LightBlueSheepMeta);
		}
		ItemStack YellowSheep = new ItemStack(Material.WOOL, 1, (short) 4);{
		ItemMeta YellowSheepMeta = YellowSheep.getItemMeta();
		ArrayList<String> yellowsheep = new ArrayList<String>();
		YellowSheepMeta.setDisplayName(ChatColor.RED + "Yellow Sheep Pet");
		//yellowsheep.add(ChatColor.GRAY + "Regular Pet");
		YellowSheepMeta.setLore(yellowsheep);
		YellowSheep.setItemMeta(YellowSheepMeta);
		}
		ItemStack LimeSheep = new ItemStack(Material.WOOL, 1, (short) 5);{
		ItemMeta LimeSheepMeta = LimeSheep.getItemMeta();
		ArrayList<String> limesheep = new ArrayList<String>();
		LimeSheepMeta.setDisplayName(ChatColor.RED + "Lime Sheep Pet");
		//limesheep.add(ChatColor.GRAY + "Regular Pet");
		LimeSheepMeta.setLore(limesheep);
		LimeSheep.setItemMeta(LimeSheepMeta);
		}
		ItemStack PinkSheep = new ItemStack(Material.WOOL, 1, (short) 6);{
		ItemMeta PinkSheepMeta = PinkSheep.getItemMeta();
		ArrayList<String> pinksheep = new ArrayList<String>();
		PinkSheepMeta.setDisplayName(ChatColor.RED + "Pink Sheep Pet");
		//pinksheep.add(ChatColor.GRAY + "Regular Pet");
		PinkSheepMeta.setLore(pinksheep);
		PinkSheep.setItemMeta(PinkSheepMeta);
		}
		ItemStack DarkGraySheep = new ItemStack(Material.WOOL, 1, (short) 7);{
		ItemMeta DarkGraySheepMeta = DarkGraySheep.getItemMeta();
		ArrayList<String> darkgraysheep = new ArrayList<String>();
		DarkGraySheepMeta.setDisplayName(ChatColor.RED + "Dark Gray Sheep Pet");
		//darkgraysheep.add(ChatColor.GRAY + "Regular Pet");
		DarkGraySheepMeta.setLore(darkgraysheep);
		DarkGraySheep.setItemMeta(DarkGraySheepMeta);
		}
		ItemStack GraySheep = new ItemStack(Material.WOOL, 1, (short) 8);{
		ItemMeta GraySheepMeta = GraySheep.getItemMeta();
		ArrayList<String> graysheep = new ArrayList<String>();
		GraySheepMeta.setDisplayName(ChatColor.RED + "Gray Sheep Pet");
		//graysheep.add(ChatColor.GRAY + "Regular Pet");
		GraySheepMeta.setLore(graysheep);
		GraySheep.setItemMeta(GraySheepMeta);
		}
		ItemStack CyanSheep = new ItemStack(Material.WOOL, 1, (short) 9);{
		ItemMeta CyanSheepMeta = CyanSheep.getItemMeta();
		ArrayList<String> cyansheep = new ArrayList<String>();
		CyanSheepMeta.setDisplayName(ChatColor.RED + "Cyan Sheep Pet");
		//cyansheep.add(ChatColor.GRAY + "Regular Pet");
		CyanSheepMeta.setLore(cyansheep);
		CyanSheep.setItemMeta(CyanSheepMeta);
		}
		ItemStack PurpleSheep = new ItemStack(Material.WOOL, 1, (short) 10);{
		ItemMeta PurpleSheepMeta = PurpleSheep.getItemMeta();
		ArrayList<String> purplesheep = new ArrayList<String>();
		PurpleSheepMeta.setDisplayName(ChatColor.RED + "Purple Sheep Pet");
		//purplesheep.add(ChatColor.GRAY + "Regular Pet");
		PurpleSheepMeta.setLore(purplesheep);
		PurpleSheep.setItemMeta(PurpleSheepMeta);
		}
		ItemStack BlueSheep = new ItemStack(Material.WOOL, 1, (short) 11);{
		ItemMeta BlueSheepMeta = BlueSheep.getItemMeta();
		ArrayList<String> bluesheep = new ArrayList<String>();
		BlueSheepMeta.setDisplayName(ChatColor.RED + "Blue Sheep Pet");
		//bluesheep.add(ChatColor.GRAY + "Regular Pet");
		BlueSheepMeta.setLore(bluesheep);
		BlueSheep.setItemMeta(BlueSheepMeta);
		}
		ItemStack BrownSheep = new ItemStack(Material.WOOL, 1, (short) 12);{
		ItemMeta BrownSheepMeta = BrownSheep.getItemMeta();
		ArrayList<String> brownsheep = new ArrayList<String>();
		BrownSheepMeta.setDisplayName(ChatColor.RED + "Brown Sheep Pet");
		//brownsheep.add(ChatColor.GRAY + "Regular Pet");
		BrownSheepMeta.setLore(brownsheep);
		BrownSheep.setItemMeta(BrownSheepMeta);
		}
		ItemStack GreenSheep = new ItemStack(Material.WOOL, 1, (short) 13);{
		ItemMeta GreenSheepMeta = GreenSheep.getItemMeta();
		ArrayList<String> greensheep = new ArrayList<String>();
		GreenSheepMeta.setDisplayName(ChatColor.RED + "Green Sheep Pet");
		//greensheep.add(ChatColor.GRAY + "Regular Pet");
		GreenSheepMeta.setLore(greensheep);
		GreenSheep.setItemMeta(GreenSheepMeta);
		}
		ItemStack RedSheep = new ItemStack(Material.WOOL, 1, (short) 14);{
		ItemMeta RedSheepMeta = RedSheep.getItemMeta();
		ArrayList<String> redsheep = new ArrayList<String>();
		RedSheepMeta.setDisplayName(ChatColor.RED + "Red Sheep Pet");
		//redsheep.add(ChatColor.GRAY + "Regular Pet");
		RedSheepMeta.setLore(redsheep);
		RedSheep.setItemMeta(RedSheepMeta);
		}
		ItemStack BlackSheep = new ItemStack(Material.WOOL, 1, (short) 15);{
		ItemMeta BlackSheepMeta = BlackSheep.getItemMeta();
		ArrayList<String> blacksheep = new ArrayList<String>();
		BlackSheepMeta.setDisplayName(ChatColor.RED + "Black Sheep Pet");
		//blacksheep.add(ChatColor.GRAY + "Regular Pet");
		BlackSheepMeta.setLore(blacksheep);
		BlackSheep.setItemMeta(BlackSheepMeta);
		}
		ItemStack SnowMan = new ItemStack(Material.JACK_O_LANTERN, 1);{
		ItemMeta SnowManMeta = SnowMan.getItemMeta();
		ArrayList<String> snowman = new ArrayList<String>();
		SnowManMeta.setDisplayName(ChatColor.RED + "Snowman Pet");
		//snowman.add(ChatColor.GRAY + "Regular Pet");
		SnowManMeta.setLore(snowman);
		SnowMan.setItemMeta(SnowManMeta);
		}
		ItemStack IronGolem = new ItemStack(Material.IRON_INGOT, 1);{
		ItemMeta IronGolemMeta = IronGolem.getItemMeta();
		ArrayList<String> irongolem = new ArrayList<String>();
		IronGolemMeta.setDisplayName(ChatColor.RED + "Iron Golem Pet");
		//irongolem.add(ChatColor.GRAY + "Regular Pet");
		IronGolemMeta.setLore(irongolem);
		IronGolem.setItemMeta(IronGolemMeta);
		}
		
		public Inventory PetInv;{
		PetInv = Bukkit.createInventory(null, 45, ChatColor.BLACK + "Pets");
		PetInv.setItem(0, Creeper);
		PetInv.setItem(1, Skeleton);
		PetInv.setItem(2, Spider);
		PetInv.setItem(3, Zombie);
		PetInv.setItem(4, Slime);
		PetInv.setItem(5, Ghast);
		PetInv.setItem(6, ZombiePigMan);
		PetInv.setItem(7, Enderman);
		PetInv.setItem(8, CaveSpider);
		PetInv.setItem(9, Silverfish);
		PetInv.setItem(10, Blaze);
		PetInv.setItem(11, MagmaCube);
		PetInv.setItem(12, Bat);
		PetInv.setItem(13, Witch);
		PetInv.setItem(14, Pig);
		PetInv.setItem(15, Sheep);
		PetInv.setItem(16, Cow);
		PetInv.setItem(17, Chicken);
		PetInv.setItem(18, Squid);
		PetInv.setItem(19, Wolf);
		PetInv.setItem(20, MushroomCow);
		PetInv.setItem(21, Ocelot);
		PetInv.setItem(22, Horse);
		PetInv.setItem(23, Villager);
		PetInv.setItem(24, SnowMan);
		PetInv.setItem(25, IronGolem);
		PetInv.setItem(27, WhiteSheep);
		PetInv.setItem(28, OrangeSheep);
		PetInv.setItem(29, MagentaSheep);
		PetInv.setItem(30, LightBlueSheep);
		PetInv.setItem(31, YellowSheep);
		PetInv.setItem(32, LimeSheep);
		PetInv.setItem(33, PinkSheep);
		PetInv.setItem(34, DarkGraySheep);
		PetInv.setItem(35, GraySheep);
		PetInv.setItem(36, CyanSheep);
		PetInv.setItem(37, PurpleSheep);
		PetInv.setItem(38, BlueSheep);
		PetInv.setItem(39, BrownSheep);
		PetInv.setItem(40, GreenSheep);
		PetInv.setItem(41, RedSheep);
		PetInv.setItem(42, BlackSheep);
		}

}
