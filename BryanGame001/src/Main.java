import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Main extends JFrame {

	public static void main(String[] args) {
		Main sample = new Main();

		GamePanel gamePanel = new GamePanel();
		gamePanel.setFocusable(true);
		gamePanel.requestFocusInWindow();

		sample.add(gamePanel, BorderLayout.CENTER);
		sample.setSize(1000, 600);
		sample.setVisible(true);
	}

}
