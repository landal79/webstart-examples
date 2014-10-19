package org.landal.webstart.example;

import java.awt.Color;

public enum ColorPalette {

	PRIMARY("#DBBDAA", "#DEA38D", "#683C2A", "#DEA38D"), SECONDARY("#DFE0E1", "#DFE0E1", "#DA6600", "#A64F01");

	private String background;
	private String menu;
	private String font;
	private String border;

	private ColorPalette(String background, String menu, String font, String border) {
		this.background = background;
		this.menu = menu;
		this.font = font;
		this.border = border;
	}

	public Color getBackground() {
		return Color.decode(background);
	}

	public Color getMenu() {
		return Color.decode(menu);
	}

	public Color getFont() {
		return Color.decode(font);
	}

	public Color getBorder() {
		return Color.decode(border);
	}
}
