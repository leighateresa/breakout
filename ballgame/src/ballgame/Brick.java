package ballgame;
import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		// Set x and y using the parameter
		this.x = x; 
		this.y = y;
		// Set the width and height of the brick
		width = Settings.BRICK_WIDTH;
		height = Settings.BRICK_HEIGHT;
	}

	public boolean isBroken() {
		return broken;
	}
	
	public void setBroken(boolean b) {
		// Set the broken variable
		broken = b;
	}
	
	public void paint(Graphics g) {
		// Update screen if brick is broken
		if(!broken) {
			g.fillRect(x, y, width, height);
		}
	}
}
