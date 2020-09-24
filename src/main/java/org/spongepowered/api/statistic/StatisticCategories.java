/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.statistic;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class StatisticCategories {

    // SORTFIELDS:ON

    public static final Supplier<StatisticCategory.ForCatalog<BlockType>> BLOCKS_BROKEN = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("blocks_broken"));

    public static final Supplier<StatisticCategory> CUSTOM = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("custom"));

    public static final Supplier<StatisticCategory.ForCatalog<EntityType<?>>> ENTITIES_KILLED = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("entities_killed"));

    public static final Supplier<StatisticCategory.ForCatalog<ItemType>> ITEMS_BROKEN = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("items_broken"));

    public static final Supplier<StatisticCategory.ForCatalog<ItemType>> ITEMS_CRAFTED = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("items_crafted"));

    public static final Supplier<StatisticCategory.ForCatalog<ItemType>> ITEMS_DROPPED = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("items_dropped"));

    public static final Supplier<StatisticCategory.ForCatalog<ItemType>> ITEMS_PICKED_UP = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("items_picked_up"));

    public static final Supplier<StatisticCategory.ForCatalog<ItemType>> ITEMS_USED = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("items_used"));

    public static final Supplier<StatisticCategory.ForCatalog<EntityType<?>>> KILLED_BY_ENTITIES = Registries.STATISTIC_CATEGORY.getSupplier(ResourceKey.minecraft("killed_by_entities"));

    // SORTFIELDS:OFF

    private StatisticCategories() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
