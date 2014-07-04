import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel {
	private Game game = new Game();

	public GamePanel() {
		game.init(); // 初始化遊戲

		// 每 10 毫秒執行
		new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.update(); // 做遊戲邏輯運算
				repaint(); // 視窗畫面重畫
			}
		}).start();
	}

	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		game.onKeyEvent(e); // 偵測鍵盤事件
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		game.draw(g); // 繪製遊戲畫面
	}

}
