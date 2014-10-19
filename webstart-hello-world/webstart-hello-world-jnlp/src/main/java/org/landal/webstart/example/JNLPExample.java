package org.landal.webstart.example;

import javax.swing.JFrame;

public class JNLPExample extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void createJNLPExample() {
		JFrame frame = new JFrame("Jave Web Start Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new HelloWorldPanel());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createJNLPExample();
			}
		});
	}

}
