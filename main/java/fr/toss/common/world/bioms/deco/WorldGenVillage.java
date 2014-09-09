package fr.toss.common.world.bioms.deco;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import fr.toss.common.entity.EntityVillagerDim;
import fr.toss.common.register.BlockRegister;

public class WorldGenVillage extends WorldGenerator
{
  public boolean generate(World w, Random r, int x, int y, int z)
  {
	    int X = x;
	    int Z = z;
	
	    y = w.getTopSolidOrLiquidBlock(x, z);
	
	    if (y < 24)
	    	return false;
	    
	    APIGen.genCubePleinTrouPorte(w, x, y - 2, z, 6, 10, 6, BlockRegister.LOGS1, Blocks.glowstone, r, 8);
	
	    APIGen.genCubeVidePorte(w, x - 1, y, z - 1, 8, 1, 8, BlockRegister.LOGS1, Blocks.air);
	
	    APIGen.genCubePleinTrou(w, x - 1, y + 6, z - 1, 8, 1, 8, BlockRegister.LOGS1, Blocks.glowstone, r, 3);
	
	    APIGen.genChest(w, x + 3, y + 2, z + 3, r);
	    APIGen.genCubePlein(w, x + 2, y + 1, z + 2, 2, 1, 2, Blocks.stained_glass);
	
	    APIGen.replaceBlocks(w, x + 9, z, 2, 20, Blocks.gravel);
	
	    for (int i = 0; i < 10 + r.nextInt(14); i++)
	    {
	      EntityVillagerDim villager = new EntityVillagerDim(w);
	      villager.setProfession(r.nextInt(8));
	      villager.setCustomNameTag(getRandomName(r));
	      villager.setLocationAndAngles(x + 10, y + 1, z + 2 + i, 0.0F, 0.0F);
	
	      if (r.nextInt(5) == 0)
	    	  villager.setGrowingAge(-2000);
	      w.spawnEntityInWorld(villager);
	    }
	
	    x += 13;
	    y = w.getTopSolidOrLiquidBlock(x, z);
	    APIGen.genCubeVidePorte(w, x, y, z, 4, 6, 4, BlockRegister.LOGS1, Blocks.iron_bars);
	    APIGen.genCubeVide(w, x - 1, y + 4, z - 1, 6, 1, 6, BlockRegister.LEAVES);
	
	    x += 3;
	    z += 11;
	    APIGen.replaceBlocks(w, x, z, 6, 10, Blocks.water);
	    APIGen.replaceBlocks(w, x - 1, z - 1, 8, 12, Blocks.packed_ice);
	
	    x = X;
	    z = Z;
	    x += 2;
	    z += 6;
	    APIGen.replaceBlocks(w, x + 9, z, 16, 2, Blocks.gravel);
	
	    x = X;
	    z = Z;
	
	    APIGen.replaceBlocks(w, x - 5, z + 9, 16, 2, Blocks.gravel);
	
	    z += 11;
	    y = w.getTopSolidOrLiquidBlock(x, z);
	
	    APIGen.genCubePleinTrouPorteTorch(w, x, y - 2, z, 6, 8, 6, Blocks.stained_hardened_clay, BlockRegister.ORE_ETHERNIUM, r, 10);
	    APIGen.genCubePleinTrou(w, x - 1, y + 4, z - 1, 8, 1, 8, Blocks.stained_hardened_clay, BlockRegister.ORE_ETHERNIUM, r, 10);
	    APIGen.genCubePlein(w, x + 2, y - 2, z + 2, 2, 1, 2, Blocks.stained_glass);
	    w.setBlock(x + 1, y - 1, z + 1, Blocks.bookshelf);
	    w.setBlock(x + 1, y - 1, z + 2, Blocks.bookshelf);
	    w.setBlock(x + 1, y - 1, z + 3, Blocks.bookshelf);
	    w.setBlock(x + 1, y - 1, z + 4, Blocks.bookshelf);
	
	    x = X;
	    z = Z;
	    x += 7;
	    z += 28;
	    y = w.getTopSolidOrLiquidBlock(x, z);
	    APIGen.genCubeVide(w, x - 1, y + 12, z - 1, 8, 1, 8, BlockRegister.LEAVES);
	    APIGen.genCubeVide(w, x - 2, y + 13, z - 2, 10, 1, 12, BlockRegister.LEAVES);
	    APIGen.genCubeVide(w, x - 3, y + 14, z - 3, 12, 1, 10, BlockRegister.LEAVES);
	    APIGen.genCubeVide(w, x - 2, y + 15, z - 2, 10, 1, 12, BlockRegister.LEAVES);
	    APIGen.genCubeVide(w, x - 1, y + 16, z - 1, 8, 1, 8, BlockRegister.LEAVES);
	
	    APIGen.genCubeVide(w, x - 1, y + 1, z - 1, 8, 1, 8, BlockRegister.LEAVES);
	    APIGen.genCubeVide(w, x - 2, y, z - 2, 10, 1, 12, BlockRegister.LEAVES);
	
	    APIGen.genCubePleinTrouPorte(w, x, y, z, 6, 18, 6, BlockRegister.LOGS1, Blocks.glowstone, r, 10);
	    
	    APIGen.genChest(w, x + 2, y + 1, z + 2, r);
	    APIGen.genChest(w, x + 2, y + 1, z + 3, r);
	
	    return true;
  }

  private String getRandomName(Random r)
  {
    int alea = r.nextInt(50);

    switch (alea) {
    case 0:
      return "Roger";
      
    case 1:
      return "Bob";
      
    case 2:
      return "Patrick";
      
    case 3:
      return "Navy";
      
    case 4:
      return "Reauchero";
      
    case 5:
      return "Cailloux";
      
    case 6:
      return "Tollim";
      
    case 7:
      return "Roger";
      
    case 8:
      return "Tluaner";
      
    case 9:
      return "Splitter";
      
    case 10:
      return "Tyrion";
      
    case 11:
      return "Alistar";
      
    case 12:
      return "Pomme";
      
    case 13:
      return "Peche";
      
    case 14:
      return "Poire";
      
    case 15:
      return "Rableg";
      
    case 16:
      return "Lennon";
      
    case 17:
      return "Ada";
      
    case 18:
      return "Ignar";
      
    case 19:
      return "Gudule";
      
    case 20:
      return "Casimir";
      
    case 21:
      return "Donald";
      
    case 22:
      return "Sivel";
      
    case 23:
      return "Elvis";
      
    case 24:
      return "Acme";
      
    case 25:
      return "Nannig";
      
    case 26:
      return "Vecter";
      
    case 27:
      return "Nelio";
      
    case 28:
      return "Oleo";
      
    case 29:
      return "Oda";
      
    case 30:
      return "Urs";
      
    case 31:
      return "Iba";
      
    case 32:
      return "Isaac";
      
    case 33:
      return "Taroc";
      
    case 34:
      return "Talia";
      
    case 35:
      return "Tange";
      
    case 36:
      return "Tessa";
      
    case 37:
      return "Taume";
      
    case 38:
      return "Waast";
      
    case 39:
      return "Mouse";
      
    case 40:
      return "Wolf";
      
    case 41:
      return "Ed";
      
    case 42:
      return "Reno";
      
    case 43:
      return "Ray";
      
    case 44:
      return "Bod";
      
    case 45:
      return "Rad";
      
    case 46:
      return "Vadim";
      
    case 47:
      return "Vaast";
      
    case 48:
      return "Edan";
      
    case 49:
      return "Eba";
    }
	return "Toss";
  }
}