import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel {
	private Game game = new Game();

	public GamePanel() {
		game.init();
		new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.update();
				repaint();
			}
		}).start();
	}

	@Override
	protected void processKeyEvent(KeyEvent e) {
		super.processKeyEvent(e);
		game.onKeyEvent(e);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		game.draw(g);
	}

}
