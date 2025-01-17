package com.mrbysco.enhancedfarming.world.feature;

import com.mrbysco.enhancedfarming.Reference;
import com.mrbysco.enhancedfarming.block.crops.NetherFlowerBlock;
import com.mrbysco.enhancedfarming.init.FarmingRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class FarmingFeatureConfigs {
	public static void initialize() {
	}

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE = FeatureUtils.register(Reference.MOD_PREFIX + "apple", FarmingFeatures.FRUIT_TREE.get(), getApple().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "apple_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getApple().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "apple_bees_002", FarmingFeatures.FRUIT_TREE.get(), getApple().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> APPLE_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "apple_bees_005", FarmingFeatures.FRUIT_TREE.get(), getApple().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_APPLE = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_apple", FarmingFeatures.FRUIT_TREE.get(), getFancyApple().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_APPLE_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_apple_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getFancyApple().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_APPLE_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_apple_bees_002", FarmingFeatures.FRUIT_TREE.get(), getFancyApple().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_APPLE_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_apple_bees_005", FarmingFeatures.FRUIT_TREE.get(), getFancyApple().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEMON = FeatureUtils.register(Reference.MOD_PREFIX + "lemon", FarmingFeatures.FRUIT_TREE.get(), getLemon().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEMON_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "lemon_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getLemon().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEMON_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "lemon_bees_002", FarmingFeatures.FRUIT_TREE.get(), getLemon().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LEMON_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "lemon_bees_005", FarmingFeatures.FRUIT_TREE.get(), getLemon().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_LEMON = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_lemon", FarmingFeatures.FRUIT_TREE.get(), getFancyLemon().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_LEMON_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_lemon_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getFancyLemon().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_LEMON_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_lemon_bees_002", FarmingFeatures.FRUIT_TREE.get(), getFancyLemon().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_LEMON_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_lemon_bees_005", FarmingFeatures.FRUIT_TREE.get(), getFancyLemon().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE = FeatureUtils.register(Reference.MOD_PREFIX + "orange", FarmingFeatures.FRUIT_TREE.get(), getOrange().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "orange_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getOrange().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "orange_bees_002", FarmingFeatures.FRUIT_TREE.get(), getOrange().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "orange_bees_005", FarmingFeatures.FRUIT_TREE.get(), getOrange().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_ORANGE = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_orange", FarmingFeatures.FRUIT_TREE.get(), getFancyOrange().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_ORANGE_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_orange_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getFancyOrange().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_ORANGE_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_orange_bees_002", FarmingFeatures.FRUIT_TREE.get(), getFancyOrange().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_ORANGE_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_orange_bees_005", FarmingFeatures.FRUIT_TREE.get(), getFancyOrange().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY = FeatureUtils.register(Reference.MOD_PREFIX + "cherry", FarmingFeatures.FRUIT_TREE.get(), getCherry().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "cherry_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getCherry().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "cherry_bees_002", FarmingFeatures.FRUIT_TREE.get(), getCherry().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "cherry_bees_005", FarmingFeatures.FRUIT_TREE.get(), getCherry().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_CHERRY = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_cherry", FarmingFeatures.FRUIT_TREE.get(), getFancyCherry().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_CHERRY_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_cherry_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getFancyCherry().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_CHERRY_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_cherry_bees_002", FarmingFeatures.FRUIT_TREE.get(), getFancyCherry().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_CHERRY_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_cherry_bees_005", FarmingFeatures.FRUIT_TREE.get(), getFancyCherry().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEAR = FeatureUtils.register(Reference.MOD_PREFIX + "pear", FarmingFeatures.FRUIT_TREE.get(), getPear().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEAR_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "pear_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getPear().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEAR_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "pear_bees_002", FarmingFeatures.FRUIT_TREE.get(), getPear().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PEAR_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "pear_bees_005", FarmingFeatures.FRUIT_TREE.get(), getPear().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_PEAR = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_pear", FarmingFeatures.FRUIT_TREE.get(), getFancyPear().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_PEAR_BEES_0002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_pear_bees_0002", FarmingFeatures.FRUIT_TREE.get(), getFancyPear().decorators(List.of(TreeFeatures.BEEHIVE_0002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_PEAR_BEES_002 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_pear_bees_002", FarmingFeatures.FRUIT_TREE.get(), getFancyPear().decorators(List.of(TreeFeatures.BEEHIVE_002)).build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FANCY_PEAR_BEES_005 = FeatureUtils.register(Reference.MOD_PREFIX + "fancy_pear_bees_005", FarmingFeatures.FRUIT_TREE.get(), getFancyPear().decorators(List.of(TreeFeatures.BEEHIVE_005)).build());

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BANANA = FeatureUtils.register(Reference.MOD_PREFIX + "banana", FarmingFeatures.FRUIT_TREE.get(), getBanana().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> AVOCADO = FeatureUtils.register(Reference.MOD_PREFIX + "avocado", FarmingFeatures.FRUIT_TREE.get(), getAvocado().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MANGO = FeatureUtils.register(Reference.MOD_PREFIX + "mango", FarmingFeatures.FRUIT_TREE.get(), getMango().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> OLIVE = FeatureUtils.register(Reference.MOD_PREFIX + "olive", FarmingFeatures.FRUIT_TREE.get(), getOlive().build());

	public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_NETHER_FLOWER = FeatureUtils.register(Reference.MOD_PREFIX + "patch_nether_flower",
			Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
					new SimpleBlockConfiguration(BlockStateProvider.simple(States.NETHER_FLOWER_CROP)),
					List.of(Blocks.SOUL_SAND), 64));


	private static TreeConfiguration.TreeConfigurationBuilder getApple() {
		return (new TreeConfiguration.TreeConfigurationBuilder(
				SimpleStateProvider.simple(States.OAK_LOG), new StraightTrunkPlacer(4, 2, 0),
				SimpleStateProvider.simple(States.APPLE_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getFancyApple() {
		return (new TreeConfiguration.TreeConfigurationBuilder(
				SimpleStateProvider.simple(States.OAK_LOG), new FancyTrunkPlacer(3, 11, 0),
				SimpleStateProvider.simple(States.APPLE_LEAVES),
				new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getLemon() {
		return (new TreeConfiguration.TreeConfigurationBuilder(
				SimpleStateProvider.simple(States.OAK_LOG), new StraightTrunkPlacer(4, 2, 0),
				SimpleStateProvider.simple(States.LEMON_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getFancyLemon() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new FancyTrunkPlacer(3, 11, 0), SimpleStateProvider.simple(States.LEMON_LEAVES),
				new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getOrange() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new StraightTrunkPlacer(4, 2, 0), SimpleStateProvider.simple(States.ORANGE_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getFancyOrange() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new FancyTrunkPlacer(3, 11, 0), SimpleStateProvider.simple(States.ORANGE_LEAVES),
				new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getCherry() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new StraightTrunkPlacer(4, 2, 0), SimpleStateProvider.simple(States.CHERRY_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getFancyCherry() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new FancyTrunkPlacer(3, 11, 0), SimpleStateProvider.simple(States.CHERRY_LEAVES),
				new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getPear() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new StraightTrunkPlacer(4, 2, 0), SimpleStateProvider.simple(States.PEAR_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getFancyPear() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new FancyTrunkPlacer(3, 11, 0), SimpleStateProvider.simple(States.PEAR_LEAVES),
				new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getBanana() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.JUNGLE_LOG),
				new StraightTrunkPlacer(4, 8, 0), SimpleStateProvider.simple(States.BANANA_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getAvocado() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new StraightTrunkPlacer(4, 2, 0), SimpleStateProvider.simple(States.AVOCADO_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getMango() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.OAK_LOG),
				new StraightTrunkPlacer(4, 2, 0), SimpleStateProvider.simple(States.MANGO_LEAVES),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 1))).ignoreVines();
	}

	private static TreeConfiguration.TreeConfigurationBuilder getOlive() {
		return (new TreeConfiguration.TreeConfigurationBuilder(SimpleStateProvider.simple(States.ACACIA_LOG),
				new ForkingTrunkPlacer(5, 2, 2), SimpleStateProvider.simple(States.OLIVE_LEAVES),
				new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
				new TwoLayersFeatureSize(1, 0, 2))).ignoreVines();
	}

	public static final class States {
		protected static final BlockState ACACIA_LOG = Blocks.ACACIA_LOG.defaultBlockState();
		protected static final BlockState JUNGLE_LOG = Blocks.JUNGLE_LOG.defaultBlockState();
		protected static final BlockState OAK_LOG = Blocks.OAK_LOG.defaultBlockState();

		protected static final BlockState APPLE_SAPLING = FarmingRegistry.APPLE_SAPLING.get().defaultBlockState();
		protected static final BlockState LEMON_SAPLING = FarmingRegistry.LEMON_SAPLING.get().defaultBlockState();
		protected static final BlockState ORANGE_SAPLING = FarmingRegistry.ORANGE_SAPLING.get().defaultBlockState();
		protected static final BlockState CHERRY_SAPLING = FarmingRegistry.CHERRY_SAPLING.get().defaultBlockState();
		protected static final BlockState PEAR_SAPLING = FarmingRegistry.PEAR_SAPLING.get().defaultBlockState();
		protected static final BlockState BANANA_SAPLING = FarmingRegistry.BANANA_SAPLING.get().defaultBlockState();
		protected static final BlockState AVOCADO_SAPLING = FarmingRegistry.AVOCADO_SAPLING.get().defaultBlockState();
		protected static final BlockState MANGO_SAPLING = FarmingRegistry.MANGO_SAPLING.get().defaultBlockState();
		protected static final BlockState OLIVE_SAPLING = FarmingRegistry.OLIVE_SAPLING.get().defaultBlockState();

		protected static final BlockState APPLE_LEAVES = FarmingRegistry.APPLE_LEAVES.get().defaultBlockState();
		protected static final BlockState LEMON_LEAVES = FarmingRegistry.LEMON_LEAVES.get().defaultBlockState();
		protected static final BlockState ORANGE_LEAVES = FarmingRegistry.ORANGE_LEAVES.get().defaultBlockState();
		protected static final BlockState CHERRY_LEAVES = FarmingRegistry.CHERRY_LEAVES.get().defaultBlockState();
		protected static final BlockState PEAR_LEAVES = FarmingRegistry.PEAR_LEAVES.get().defaultBlockState();
		protected static final BlockState BANANA_LEAVES = FarmingRegistry.BANANA_LEAVES.get().defaultBlockState();
		protected static final BlockState AVOCADO_LEAVES = FarmingRegistry.AVOCADO_LEAVES.get().defaultBlockState();
		protected static final BlockState MANGO_LEAVES = FarmingRegistry.MANGO_LEAVES.get().defaultBlockState();
		protected static final BlockState OLIVE_LEAVES = FarmingRegistry.OLIVE_LEAVES.get().defaultBlockState();

		protected static final BlockState SOUL_SAND = Blocks.SOUL_SAND.defaultBlockState();
		protected static final BlockState NETHER_FLOWER_CROP = FarmingRegistry.NETHER_FLOWER_CROP.get().defaultBlockState().setValue(NetherFlowerBlock.AGE, Integer.valueOf(5));
	}
}
