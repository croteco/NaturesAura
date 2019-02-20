package de.ellpeck.naturesaura.recipes;

import de.ellpeck.naturesaura.Helper;
import de.ellpeck.naturesaura.NaturesAura;
import de.ellpeck.naturesaura.api.NaturesAuraAPI;
import de.ellpeck.naturesaura.api.recipes.*;
import de.ellpeck.naturesaura.api.recipes.ing.AmountIngredient;
import de.ellpeck.naturesaura.api.recipes.ing.NBTIngredient;
import de.ellpeck.naturesaura.blocks.ModBlocks;
import de.ellpeck.naturesaura.chunk.effect.AnimalEffect;
import de.ellpeck.naturesaura.chunk.effect.CacheRechargeEffect;
import de.ellpeck.naturesaura.chunk.effect.PlantBoostEffect;
import de.ellpeck.naturesaura.items.ItemAuraBottle;
import de.ellpeck.naturesaura.items.ItemEffectPowder;
import de.ellpeck.naturesaura.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockWall;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public final class ModRecipes {

    public static void init() {
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "eye"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING)), new ItemStack(ModItems.EYE), 250,
                Ingredient.fromItem(Items.SPIDER_EYE),
                Ingredient.fromItem(Items.GOLD_INGOT),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromItem(ModItems.GOLD_LEAF)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "eye_improved"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING)), new ItemStack(ModItems.EYE_IMPROVED), 500,
                Ingredient.fromItem(ModItems.EYE),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Helper.blockIng(ModBlocks.END_FLOWER),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromItem(ModItems.GOLD_LEAF)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "nature_altar"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModBlocks.NATURE_ALTAR), 500,
                Helper.blockIng(Blocks.STONE),
                Helper.blockIng(Blocks.STONE),
                Helper.blockIng(Blocks.STONE),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromItem(Items.GOLD_INGOT),
                Ingredient.fromItem(ModItems.TOKEN_JOY)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "ancient_sapling"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModBlocks.ANCIENT_SAPLING), 200,
                Helper.blockIng(Blocks.SAPLING),
                Helper.blockIng(Blocks.YELLOW_FLOWER),
                Helper.blockIng(Blocks.RED_FLOWER),
                Ingredient.fromItem(Items.WHEAT_SEEDS),
                Ingredient.fromItem(Items.REEDS),
                Ingredient.fromItem(ModItems.GOLD_LEAF)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "furnace_heater"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModBlocks.FURNACE_HEATER), 600,
                Helper.blockIng(ModBlocks.INFUSED_STONE),
                Helper.blockIng(ModBlocks.INFUSED_STONE),
                Ingredient.fromItem(ModItems.INFUSED_IRON),
                Ingredient.fromItem(ModItems.INFUSED_IRON),
                Ingredient.fromItem(Items.FIRE_CHARGE),
                Ingredient.fromItem(Items.FLINT),
                Helper.blockIng(Blocks.MAGMA),
                Ingredient.fromItem(ModItems.TOKEN_FEAR)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "conversion_catalyst"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING, 1, 3)), new ItemStack(ModBlocks.CONVERSION_CATALYST), 600,
                Helper.blockIng(ModBlocks.GOLD_BRICK),
                Helper.blockIng(ModBlocks.INFUSED_STONE),
                Ingredient.fromItem(Items.BREWING_STAND),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Helper.blockIng(Blocks.GLOWSTONE)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "crushing_catalyst"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModBlocks.CRUSHING_CATALYST), 600,
                Helper.blockIng(ModBlocks.GOLD_BRICK),
                Helper.blockIng(ModBlocks.INFUSED_STONE),
                Helper.blockIng(Blocks.PISTON),
                Ingredient.fromItem(Items.FLINT),
                Ingredient.fromItem(ModItems.TOKEN_ANGER)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "plant_powder"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING)),
                ItemEffectPowder.setEffect(new ItemStack(ModItems.EFFECT_POWDER, 24), PlantBoostEffect.NAME), 400,
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Ingredient.fromItem(Items.WHEAT)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "cache_powder"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING)),
                ItemEffectPowder.setEffect(new ItemStack(ModItems.EFFECT_POWDER, 32), CacheRechargeEffect.NAME), 400,
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Ingredient.fromItem(ModItems.AURA_CACHE)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "animal_powder"),
                Ingredient.fromStacks(new ItemStack(Blocks.SAPLING, 1, 3)),
                ItemEffectPowder.setEffect(new ItemStack(ModItems.EFFECT_POWDER, 8), AnimalEffect.NAME), 400,
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Helper.blockIng(ModBlocks.GOLD_POWDER),
                Ingredient.fromItem(ModItems.SKY_INGOT),
                Ingredient.fromItem(Items.EGG)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_joy"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModItems.TOKEN_JOY, 2), 200,
                new NBTIngredient(ItemAuraBottle.setType(new ItemStack(ModItems.AURA_BOTTLE), NaturesAuraAPI.TYPE_OVERWORLD)),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromStacks(new ItemStack(Blocks.RED_FLOWER, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.YELLOW_FLOWER)),
                Ingredient.fromItem(Items.APPLE),
                Helper.blockIng(Blocks.TORCH),
                Ingredient.fromItem(Items.IRON_INGOT)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_anger"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModItems.TOKEN_ANGER, 2), 200,
                new NBTIngredient(ItemAuraBottle.setType(new ItemStack(ModItems.AURA_BOTTLE), NaturesAuraAPI.TYPE_NETHER)),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Helper.blockIng(Blocks.MAGMA),
                Ingredient.fromItem(Items.BLAZE_POWDER),
                Ingredient.fromItem(Items.GUNPOWDER),
                Ingredient.fromItem(Items.ENDER_PEARL)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_sorrow"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModItems.TOKEN_SORROW, 2), 200,
                new NBTIngredient(ItemAuraBottle.setType(new ItemStack(ModItems.AURA_BOTTLE), NaturesAuraAPI.TYPE_OVERWORLD)),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromItem(Items.GHAST_TEAR),
                Ingredient.fromItems(Items.BEEF, Items.MUTTON, Items.CHICKEN, Items.PORKCHOP),
                Helper.blockIng(Blocks.GLASS),
                Ingredient.fromItem(Items.FISH)).register();
        new TreeRitualRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_fear"),
                Helper.blockIng(Blocks.SAPLING), new ItemStack(ModItems.TOKEN_FEAR, 2), 200,
                new NBTIngredient(ItemAuraBottle.setType(new ItemStack(ModItems.AURA_BOTTLE), NaturesAuraAPI.TYPE_NETHER)),
                Ingredient.fromItem(ModItems.GOLD_LEAF),
                Ingredient.fromItem(Items.ROTTEN_FLESH),
                Ingredient.fromItem(Items.FEATHER),
                Ingredient.fromItem(Items.BONE),
                Helper.blockIng(Blocks.SOUL_SAND)).register();

        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "infused_iron"),
                Ingredient.fromItem(Items.IRON_INGOT), new ItemStack(ModItems.INFUSED_IRON),
                Ingredient.EMPTY, 15000, 80).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "infused_iron_block"),
                Helper.blockIng(Blocks.IRON_BLOCK), new ItemStack(ModBlocks.INFUSED_IRON),
                Ingredient.EMPTY, 135000, 700).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "infused_stone"),
                Helper.blockIng(Blocks.STONE), new ItemStack(ModBlocks.INFUSED_STONE),
                Ingredient.EMPTY, 7500, 40).register();

        Ingredient conversion = Helper.blockIng(ModBlocks.CONVERSION_CATALYST);
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "breath"),
                new NBTIngredient(ItemAuraBottle.setType(new ItemStack(ModItems.AURA_BOTTLE), NaturesAuraAPI.TYPE_END)),
                new ItemStack(Items.DRAGON_BREATH),
                conversion, 20000, 80).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "leather"),
                Ingredient.fromItem(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER),
                conversion, 10000, 50).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "soul_sand"),
                Helper.blockIng(Blocks.SAND), new ItemStack(Blocks.SOUL_SAND),
                conversion, 5000, 100).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "nether_wart"),
                Helper.blockIng(Blocks.RED_MUSHROOM), new ItemStack(Items.NETHER_WART),
                conversion, 30000, 250).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "prismarine"),
                Ingredient.fromItem(Items.QUARTZ), new ItemStack(Items.PRISMARINE_SHARD),
                conversion, 55000, 200).register();

        Ingredient crushing = Helper.blockIng(ModBlocks.CRUSHING_CATALYST);
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "bone"),
                Ingredient.fromItem(Items.BONE), new ItemStack(Items.DYE, 6, 15),
                crushing, 3000, 40).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "sugar"),
                Ingredient.fromItem(Items.REEDS), new ItemStack(Items.SUGAR, 3),
                crushing, 3000, 40).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "blaze"),
                Ingredient.fromItem(Items.BLAZE_ROD), new ItemStack(Items.BLAZE_POWDER, 4),
                crushing, 5000, 60).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "glowstone"),
                Helper.blockIng(Blocks.GLOWSTONE), new ItemStack(Items.GLOWSTONE_DUST, 4),
                crushing, 3000, 40).register();
        new AltarRecipe(new ResourceLocation(NaturesAura.MOD_ID, "sand"),
                Helper.blockIng(Blocks.COBBLESTONE), new ItemStack(Blocks.SAND),
                crushing, 3000, 40).register();

        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "sky_ingot"),
                new AmountIngredient(new ItemStack(ModItems.INFUSED_IRON, 3)),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.SKY_INGOT)).register();
        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "clock_hand"),
                Ingredient.fromItem(Items.NETHER_STAR),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.CLOCK_HAND)).register();
        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_euphoria"),
                Ingredient.fromItem(ModItems.TOKEN_JOY),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.TOKEN_EUPHORIA)).register();
        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_rage"),
                Ingredient.fromItem(ModItems.TOKEN_ANGER),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.TOKEN_RAGE)).register();
        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_grief"),
                Ingredient.fromItem(ModItems.TOKEN_SORROW),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.TOKEN_GRIEF)).register();
        new OfferingRecipe(new ResourceLocation(NaturesAura.MOD_ID, "token_terror"),
                Ingredient.fromItem(ModItems.TOKEN_FEAR),
                Ingredient.fromItem(ModItems.CALLING_SPIRIT),
                new ItemStack(ModItems.TOKEN_TERROR)).register();

        NaturesAuraAPI.BOTANIST_PICKAXE_CONVERSIONS.put(
                Blocks.COBBLESTONE.getDefaultState(),
                Blocks.MOSSY_COBBLESTONE.getDefaultState());
        NaturesAuraAPI.BOTANIST_PICKAXE_CONVERSIONS.put(
                Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.DEFAULT),
                Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.MOSSY));
        NaturesAuraAPI.BOTANIST_PICKAXE_CONVERSIONS.put(
                Blocks.COBBLESTONE_WALL.getDefaultState().withProperty(BlockWall.VARIANT, BlockWall.EnumType.NORMAL),
                Blocks.COBBLESTONE_WALL.getDefaultState().withProperty(BlockWall.VARIANT, BlockWall.EnumType.MOSSY));

        for (Block block : ForgeRegistries.BLOCKS)
            if (block instanceof BlockFlower)
                NaturesAuraAPI.FLOWERS.addAll(block.getBlockState().getValidStates());

        spawner("cow", "minecraft:cow", 50000, 60, Ingredient.fromItem(Items.BEEF), Ingredient.fromItem(Items.LEATHER));
        for (EnumDyeColor color : EnumDyeColor.values())
            new AnimalSpawnerRecipe(new ResourceLocation(NaturesAura.MOD_ID, "sheep_" + color.getName()), new ResourceLocation("minecraft:sheep"),
                    500, 60, Ingredient.fromItem(ModItems.BIRTH_SPIRIT), Ingredient.fromItem(Items.MUTTON),
                    Ingredient.fromStacks(new ItemStack(Blocks.WOOL, 1, color.getMetadata()))) {
                @Override
                public Entity makeEntity(World world, double x, double y, double z) {
                    EntitySheep sheep = (EntitySheep) super.makeEntity(world, x, y, z);
                    sheep.setFleeceColor(color);
                    return sheep;
                }
            }.register();
        spawner("chicken", "minecraft:chicken", 30000, 40, Ingredient.fromItem(Items.FEATHER), Ingredient.fromItem(Items.EGG));
        spawner("pig", "minecraft:pig", 50000, 60, Ingredient.fromItem(Items.PORKCHOP));
        spawner("blaze", "minecraft:blaze", 150000, 120, Ingredient.fromItem(Items.BLAZE_ROD), Ingredient.fromItem(Items.BLAZE_POWDER));
        spawner("ghast", "minecraft:ghast", 120000, 150, Ingredient.fromItem(Items.GUNPOWDER), Ingredient.fromItem(Items.GHAST_TEAR));
        spawner("ocelot", "minecraft:ocelot", 80000, 60, Ingredient.fromItem(Items.FISH), Helper.blockIng(Blocks.WOOL));
        spawner("mule", "minecraft:mule", 100000, 100, Ingredient.fromItem(Items.LEATHER), Helper.blockIng(Blocks.CHEST), Ingredient.fromItem(Items.APPLE));
        spawner("bat", "minecraft:bat", 30000, 40, Ingredient.fromItem(Items.FEATHER));
        spawner("endermite", "minecraft:endermite", 30000, 40, Ingredient.fromItem(Items.ENDER_PEARL), Helper.blockIng(Blocks.STONE));
        spawner("parrot", "minecraft:parrot", 50000, 60, Ingredient.fromItem(Items.FEATHER), Ingredient.fromItem(Items.COOKIE));
        spawner("slime", "minecraft:slime", 30000, 40, Ingredient.fromItem(Items.SLIME_BALL));
        spawner("spider", "minecraft:spider", 100000, 120, Ingredient.fromItem(Items.STRING), Ingredient.fromItem(Items.SPIDER_EYE));
        spawner("skeleton", "minecraft:skeleton", 100000, 120, Ingredient.fromItem(Items.BONE), Ingredient.fromItem(Items.ARROW));
        spawner("enderman", "minecraft:enderman", 120000, 120, Ingredient.fromItem(Items.ENDER_PEARL));
        spawner("silverfish", "minecraft:silverfish", 30000, 40, Helper.blockIng(Blocks.STONE));
        spawner("squid", "minecraft:squid", 50000, 40, Ingredient.fromStacks(new ItemStack(Items.DYE, 1, EnumDyeColor.BLACK.getDyeDamage())));
        spawner("stray", "minecraft:stray", 100000, 120, Ingredient.fromItem(Items.BONE), Helper.blockIng(Blocks.ICE));
        spawner("shulker", "minecraft:shulker", 150000, 100, Ingredient.fromItem(Items.SHULKER_SHELL));
        spawner("husk", "minecraft:husk", 100000, 120, Ingredient.fromItem(Items.ROTTEN_FLESH), Helper.blockIng(Blocks.SAND));
        spawner("llama", "minecraft:llama", 60000, 80, Ingredient.fromStacks(new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE)));
        spawner("rabbit", "minecraft:rabbit", 30000, 40, Ingredient.fromItem(Items.RABBIT_HIDE));
        spawner("magma_cube", "minecraft:magma_cube", 100000, 100, Ingredient.fromItem(Items.MAGMA_CREAM));
        spawner("zombie_pigman", "minecraft:zombie_pigman", 120000, 150, Ingredient.fromItem(Items.ROTTEN_FLESH), Ingredient.fromItem(Items.GOLD_NUGGET));
        spawner("polar_bear", "minecraft:polar_bear", 50000, 60, Ingredient.fromItem(Items.FISH), Helper.blockIng(Blocks.ICE));
        spawner("mooshroom", "minecraft:mooshroom", 40000, 60, Ingredient.fromItem(Items.LEATHER), Helper.blockIng(Blocks.RED_MUSHROOM));
        spawner("guardian", "minecraft:guardian", 150000, 150, Ingredient.fromItem(Items.PRISMARINE_SHARD), Ingredient.fromItem(Items.PRISMARINE_CRYSTALS));
        spawner("horse", "minecraft:horse", 100000, 100, Ingredient.fromItem(Items.LEATHER));
        spawner("donkey", "minecraft:donkey", 100000, 100, Ingredient.fromItem(Items.LEATHER), Helper.blockIng(Blocks.CHEST));
        spawner("cave_spider", "minecraft:cave_spider", 100000, 120, Ingredient.fromItem(Items.STRING), Ingredient.fromItem(Items.FERMENTED_SPIDER_EYE));
        spawner("creeper", "minecraft:creeper", 100000, 120, Ingredient.fromItem(Items.GUNPOWDER));
        spawner("witch", "minecraft:witch", 150000, 150, Ingredient.fromItem(Items.GLASS_BOTTLE), Ingredient.fromItem(Items.GLOWSTONE_DUST));
        spawner("wither_skeleton", "minecraft:wither_skeleton", 150000, 150, Ingredient.fromItem(Items.BONE), Helper.blockIng(Blocks.OBSIDIAN));
        spawner("wolf", "minecraft:wolf", 50000, 60, Ingredient.fromItem(Items.LEATHER), Ingredient.fromItem(Items.BONE));
        spawner("zombie", "minecraft:zombie", 100000, 100, Ingredient.fromItem(Items.ROTTEN_FLESH));

        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreCoal", 5000));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherCoal", 5000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreIron", 3000));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherIron", 3000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreGold", 500));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherGold", 500));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreDiamond", 50));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherDiamond", 50));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreLapis", 250));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherLapis", 250));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreRedstone", 200));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherRedstone", 200));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreEmerald", 30));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreQuartz", 3000));

        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreCopper", 2000));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherCopper", 2000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreTin", 1800));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherTin", 1800));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreLead", 1500));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherLead", 1500));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreSilver", 1000));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherSilver", 1000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreNickel", 100));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherNickel", 100));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePlatinum", 20));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreNetherPlatinum", 20));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreAluminum", 1200));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreAluminium", 1200));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreOsmium", 1500));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreZinc", 1000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreYellorite", 1200));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreUranium", 400));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreCertusQuartz", 800));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreApatite", 700));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreQuartzBlack", 3000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreRuby", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePeridot", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreTopaz", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreTanzanite", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreMalachite", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreSapphire", 40));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreAmber", 150));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreResonating", 50));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreSulfur", 3000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreSaltpeter", 250));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreFirestone", 30));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreSalt", 2900));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("oreDraconium", 5));

        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorIron", 3000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorGold", 500));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorCopper", 2000));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorTin", 1800));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorLead", 1500));
        NaturesAuraAPI.OVERWORLD_ORES.add(new WeightedOre("orePoorSilver", 1000));

        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreCobalt", 50));
        NaturesAuraAPI.NETHER_ORES.add(new WeightedOre("oreArdite", 50));
    }

    private static void spawner(String name, String entity, int aura, int time, Ingredient... ings) {
        Ingredient[] actualIngs = new Ingredient[ings.length + 1];
        actualIngs[0] = Ingredient.fromItem(ModItems.BIRTH_SPIRIT);
        System.arraycopy(ings, 0, actualIngs, 1, ings.length);
        new AnimalSpawnerRecipe(new ResourceLocation(NaturesAura.MOD_ID, name), new ResourceLocation(entity), aura, time, actualIngs).register();
    }
}
