import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class GameTool {

	public static boolean isCollision(Circle c1, Circle c2) {
		if (c1 == null || c2 == null) return false;

		int xDist = c1.x - c2.x;
		int yDist = c1.y - c2.y;
		int rSum = c1.r + c2.r;
		if (Math.pow(xDist, 2) + Math.pow(yDist, 2) <= Math.pow(rSum, 2)) {
			return true;
		}
		return false;
	}

	public static void drawImage(Graphics g, BufferedImage image, Circle c) {
		g.drawImage(image, c.x - c.r, c.y - c.r , c.r * 2, c.r * 2, null);
	}

	public static void drawBackground(Graphics g, BufferedImage background) {
		g.drawImage(background, 0, 0, 1000, 600, null);
	}

	public static void drawBulletImage(Graphics g, BufferedImage image, Circle c) {
		g.drawImage(image, c.x - c.r + 5, c.y - c.r , 10, 38, null);
	}

}
