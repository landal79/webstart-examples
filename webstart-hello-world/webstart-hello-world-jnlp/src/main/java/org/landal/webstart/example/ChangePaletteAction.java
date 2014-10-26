package org.landal.webstart.example;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ChangePaletteAction extends AbstractAction {

    private static final long serialVersionUID = 1L;

    private JPanel panel;
    private PaletteManager paletteManager;

    public ChangePaletteAction(JPanel component, PaletteManager paletteManager) {
        super();
        this.panel = component;
        this.paletteManager = paletteManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ColorPalette palette = null;
        switch (paletteManager.getPalette()) {
        case PRIMARY:
            palette = ColorPalette.SECONDARY;
            break;
        default:
            palette = ColorPalette.PRIMARY;
        }

        paletteManager.setPalette(palette);
        panel.setBackground(palette.getBackground());
        panel.setBorder(BorderFactory.createLineBorder(palette.getBorder(), 5));

        // panel.revalidate();
    }

}
