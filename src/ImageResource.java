import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageResource {
	private static BufferedImage bg;
	private static BufferedImage playerPlane;
	private static BufferedImage enemyPlane;
	private static BufferedImage playerBullet;
	private static BufferedImage enemyBullet;

	public static void load() {
		try {
			bg = ImageIO.read(new File("image/blue.png"));
			playerPlane = ImageIO.read(new File("image/playerShip1_red.png"));
			enemyPlane = ImageIO.read(new File("image/enemyRed2.png"));
			playerBullet = ImageIO.read(new File("image/laserGreen13.png"));
			enemyBullet = ImageIO.read(new File("image/laserRed05.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static BufferedImage getPlayerPlane() {
		return playerPlane;
	}

	public static BufferedImage getEnemyPlane() {
		return enemyPlane;
	}

	public static BufferedImage getPlayerBullet() {
		return playerBullet;
	}

	public static BufferedImage getEnemyBullet() {
		return enemyBullet;
	}

	public static BufferedImage getBackground() {
		return bg;
	}

}
