import java.awt.Graphics;


public class Enemy extends Circle {

	public Enemy(int x, int y, int r) {
		super(x, y, r);
	}

	public EnemyBullet shoot() {
		return new EnemyBullet(x, y, 10);
	}
	
	@Override
	public void show(Graphics g) {
		GameTool.drawImage(g, ImageResource.getEnemyPlane(), this);
	}

}
