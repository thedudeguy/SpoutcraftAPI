/*
 * This file is part of SpoutcraftAPI (http://wiki.getspout.org/).
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
package org.spoutcraft.spoutcraftapi.gui;

import org.lwjgl.opengl.GL11;
import org.spoutcraft.spoutcraftapi.Spoutcraft;
import org.spoutcraft.spoutcraftapi.UnsafeClass;

@UnsafeClass
public class DirtBackground extends GenericWidget{

	public WidgetType getType() {
		return WidgetType.DirtBackground;
	}

	public void render() {
		GL11.glDisable(2896 /*GL_LIGHTING*/);
		GL11.glDisable(2912 /*GL_FOG*/);
		GL11.glBindTexture(3553 /*GL_TEXTURE_2D*/, Spoutcraft.getTessellator().getMCTexture("/gui/background.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		float var3 = 32.0F;
		Spoutcraft.getTessellator().startDrawingQuads();
		Spoutcraft.getTessellator().setColorOpaqueInt(4210752);
		Spoutcraft.getTessellator().addVertexWithUV(0.0D, this.getHeight(), 0.0D, 0.0D, this.getHeight() / var3);
		Spoutcraft.getTessellator().addVertexWithUV(this.getWidth(), this.getHeight(), 0.0D, this.getWidth() / var3, this.getHeight() / var3);
		Spoutcraft.getTessellator().addVertexWithUV(this.getWidth(), 0.0D, 0.0D, this.getWidth() / var3, 0.0D);
		Spoutcraft.getTessellator().addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
		Spoutcraft.getTessellator().draw();
	}

}
