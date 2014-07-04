import java.awt.Graphics;


public class Bullet extends Circle {

	public Bullet(int x, int y, int r) {
		super(x, y, r);
	}

	public void fly() {
		y = y - 2;
	}

	@Override
	public void show(Graphics g) {
		GameTool.drawBulletImage(g, ImageResource.getPlayerBullet(), this);
	}
	
}
