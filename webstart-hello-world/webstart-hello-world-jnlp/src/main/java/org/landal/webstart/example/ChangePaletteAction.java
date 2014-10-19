package org.landal.webstart.example;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

public class ChangePaletteAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private JPanel panel;

	public ChangePaletteAction(JPanel panel) {
		super();
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		switch (panel.getPalette()) {
//		case PRIMARY:
//			panel.setBackground(ColorPalette.SECONDARY.getBackground());
//			panel.setPalette(ColorPalette.SECONDARY);
//			break;
//		default:
//			panel.setBackground(ColorPalette.PRIMARY.getBackground());
//			panel.setPalette(ColorPalette.PRIMARY);
//			break;
//		}
		panel.revalidate();
	}

}
