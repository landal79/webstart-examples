package org.landal.webstart.example;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldPanel extends JPanel implements PaletteManager {

    private static final long serialVersionUID = 1L;

    private ColorPalette palette;

    public HelloWorldPanel() {
        this.palette = ColorPalette.PRIMARY;
        this.setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 200));
        setBackground(palette.getBackground());
        setFont(new Font("Serif", Font.PLAIN, 24));
        add(createBody(), BorderLayout.CENTER);
        add(createFooter(), BorderLayout.SOUTH);
    }

    private JPanel createBody() {
        JPanel bodyPanel = new JPanel();
        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));
        
        JPanel labelPanel = createLabelPanel();
        bodyPanel.add(labelPanel);
        bodyPanel.add(createButton(labelPanel));
        return bodyPanel;
    }

    public JPanel createLabelPanel() {
        JPanel panel = new JPanel();
        // panel.setPreferredSize(new Dimension(100, 50));
        panel.setBorder(BorderFactory.createLineBorder(palette.getBorder(), 5));
        panel.setForeground(palette.getFont());

        JLabel label = new JLabel("Hello World!");
        // label.setSize(100, 30);
        panel.add(label);

        return panel;
    }

    public JButton createButton(JPanel panel) {
        JButton btn = new JButton(new ChangePaletteAction(panel, this));
        // btn.setPreferredSize(new Dimension(10, 10));
        btn.setText("Change color");
        return btn;
    }
    
    public JPanel createFooter() {
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(palette.getMenu());

        JLabel label = new JLabel("Copyright Landal") {
            private static final long serialVersionUID = 1L;
            {
                setSize(200, 100);
                setLocation(80, 50);
            }
        };
        
        footerPanel.add(label);
        return footerPanel;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is a painted string!", 10, 70);
    }

    // /////////////////////////////// PaletteManager

    public ColorPalette getPalette() {
        return palette;
    }

    public void setPalette(ColorPalette palette) {
        this.palette = palette;
    }

}
