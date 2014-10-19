package org.landal.webstart.example;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ColorPalette palette;

	public HelloWorldPanel() {
		this.palette = ColorPalette.PRIMARY;
		this.setLayout(new BorderLayout());
		setPreferredSize(new Dimension(350, 200));
		setBackground(palette.getBackground());
		setFont(new Font("Serif", Font.PLAIN, 24));
		addBody();
		addFooter();
	}

	private void addBody() {
		JPanel bodyPanel = new JPanel(new GridLayout(2, 1));
		addLabel(bodyPanel);
		addButton(bodyPanel);
		add(bodyPanel, BorderLayout.CENTER);
	}

	@Override
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is my custom Panel!",10,70);
    }

	@Override
	public Dimension getPreferredSize() {
		return super.getPreferredSize();
	}

	public void addLabel(JPanel bodyPanel) {
		JLabel label = new JLabel("Hello World!");
		label.setSize(200, 30);
		label.setBorder(BorderFactory.createLineBorder(palette.getBorder(), 5));
		label.setForeground(palette.getFont());
		bodyPanel.add(label);
	}

	public void addButton(JPanel bodyPanel){
		JButton btn = new JButton(new ChangePaletteAction(bodyPanel));
		btn.setPreferredSize(new Dimension(10, 10));
		btn.setText("Change _colors");
		bodyPanel.add(btn);
	}

	public void addFooter() {
		JLabel label = new JLabel("Copyright Landal");
		label.setSize(200, 30);
		label.setLocation(80, 50);
		label.setBackground(palette.getMenu());
		add(label, BorderLayout.PAGE_END);
	}

	/////////////////////////////////

	public ColorPalette getPalette() {
		return palette;
	}

	public void setPalette(ColorPalette palette) {
		this.palette = palette;
	}

}
