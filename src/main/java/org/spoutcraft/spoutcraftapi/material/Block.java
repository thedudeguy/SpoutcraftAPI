/*
 * This file is part of SpoutcraftAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutcraftAPI is licensed under the GNU Lesser General Public License.
 *
 * SpoutcraftAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutcraftAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.spoutcraftapi.material;

import org.spoutcraft.spoutcraftapi.block.design.BlockDesign;

public interface Block extends Material{
	public float getFriction();

	public Block setFriction(float slip);

	public float getHardness();

	public Block setHardness(float hardness);

	public boolean isOpaque();

	public Block setOpaque(boolean opaque);

	public int getLightLevel();

	public Block setLightLevel(int level);

	public BlockDesign getBlockDesign();

	public Block setBlockDesign(BlockDesign design);
}
