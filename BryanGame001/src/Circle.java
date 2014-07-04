import java.awt.Graphics;


public class Circle {
	public int x, y; // 圓心坐標
	public int r; // 半徑

	// 產生物件時，指定圓心坐標與半徑
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	// 把圓畫在視窗中
	public void show(Graphics g) {
		g.drawOval(x - r, y - r, 2*r, 2*r);
	}

}
