import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;

	Rocketship(int i, int j, int k, int l) {

		x = i;
		y = j;
		width = k;
		height = l;
		int speed = 5;

	}

	void update() {

		if (left == true) {

		}
		if (right == true) {

		}
		if (down == true) {

		}
		if (up == true) {

		}

	}

	void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}

}