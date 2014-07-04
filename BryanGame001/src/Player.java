import java.awt.Graphics;


public class Player extends Circle {

	public Player(int x, int y, int r) {
		super(x, y, r);
	}

	public void moveUp() {
		y = y - 10;
	}

	public void moveDown() {
		y = y + 10;
	}

	public void moveLeft() {
		x = x - 10;
	}

	public void moveRight() {
		x = x + 10;
	}

	public Bullet shoot() {
		return new Bullet(x, y, 10);
	}

	@Override
	public void show(Graphics g) {
		GameTool.drawImage(g, ImageResource.getPlayerPlane(), this);
	}

}
