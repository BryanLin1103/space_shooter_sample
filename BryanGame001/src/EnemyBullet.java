import java.awt.Graphics;


public class EnemyBullet extends Circle {

	public EnemyBullet(int x, int y, int r) {
		super(x, y, r);
	}

	public void fly() {
		y = y + 5;
	}
	
	@Override
	public void show(Graphics g) {
		GameTool.drawBulletImage(g, ImageResource.getEnemyBullet(), this);
	}

}
