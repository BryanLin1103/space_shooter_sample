import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Main extends JFrame {

	public static void main(String[] args) {
		// 產生主程式視窗
		Main sample = new Main();

		// 產生遊戲畫面
		GamePanel gamePanel = new GamePanel();
		gamePanel.setFocusable(true);
		gamePanel.requestFocusInWindow();

		sample.add(gamePanel, BorderLayout.CENTER);
		sample.setSize(1000, 600); // 設定視窗的寬與高
		sample.setVisible(true);
	}

}
