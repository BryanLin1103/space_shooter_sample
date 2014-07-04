import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;


public class Game {

	// 產生一堆敵人子彈
	private List<EnemyBullet> eBullets = new ArrayList<EnemyBullet>();

	// 產生一堆敵人
	private List<Enemy> enemies = new ArrayList<Enemy>();

	// 產生一堆子彈
	private List<Bullet> bullets = new ArrayList<Bullet>();

	// 產生玩家
	private Player player = new Player(500, 500, 25);

	// 遊戲初始化
	public void init() {
		ImageResource.load(); // Load 圖

		for (int i = 0; i < 10; i++) {
			Enemy e = new Enemy(50 + i * 100, 100, 25);
			enemies.add(e);
		}

		initGameAI();
	}

	private void initGameAI() {
		// 每 2000 毫秒執行
		new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Enemy enemy : enemies) {
					EnemyBullet eb = enemy.shoot();
					eBullets.add(eb);
				}
			}
		}).start();
	}

	// 遊戲邏輯運算
	public void update() {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			bullet.fly();

			for (int j = 0; j < enemies.size(); j++) {
				Enemy enemy = enemies.get(j);

				if (GameTool.isCollision(bullet, enemy)) {
					// 敵人要消失
					enemies.remove(enemy);

					// 子彈要消失
					bullets.remove(bullet);
				}
			}
		}

		for (int i = 0; i < eBullets.size(); i++) {
			EnemyBullet eb = eBullets.get(i);
			eb.fly();

			if (GameTool.isCollision(eb, player)) {
				// 自己要消失
				player = null;

				// 子彈要消失
				eBullets.remove(eb);
			}
		}
	}

	// 遊戲畫面顯示
	public void draw(Graphics g) {
		GameTool.drawBackground(g, ImageResource.getBackground());

		if (player != null) player.show(g); // show 

		for (Bullet bullet : bullets) bullet.show(g); 
		for (Enemy enemy : enemies) enemy.show(g); 
		for (EnemyBullet eb : eBullets) eb.show(g); 
	}

	// 處理鍵盤輸入
	public void onKeyEvent(KeyEvent e) {
		if (player == null) return;

		switch (e.getKeyCode()) {

		// 上
		case KeyEvent.VK_UP:
			player.moveUp();
			break;

		case KeyEvent.VK_DOWN:
			player.moveDown();
			break;

		case KeyEvent.VK_LEFT:
			player.moveLeft();
			break;

		case KeyEvent.VK_RIGHT:
			player.moveRight();
			break;

		case KeyEvent.VK_SPACE:
			Bullet bullet = player.shoot();
			bullets.add(bullet);
			break;
		}
	}

}
