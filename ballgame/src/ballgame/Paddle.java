package ballgame;
import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		// Set the width and height of the paddle
		width = Settings.PADDLE_WIDTH;
		height = Settings.PADDLE_HEIGHT;
		// Call resetPosition
		resetPosition();
	}
	
	public void resetPosition() {
		// Set initial position x and y
		x = Settings.INITIAL_PADDLE_X;
        y = Settings.INITIAL_PADDLE_Y;
	}
	
	public void update() {
		x += xVelocity;

        // Prevent the paddle from moving outside of the screen
        if (x < 0) {
            x = 0; // Left boundary
        }
        if (x > Settings.WINDOW_WIDTH - width) {
            x = Settings.WINDOW_WIDTH - width - 16; // Right boundary
        }
	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, width, height);
	}
	
	public void setXVelocity(int vel) {
		xVelocity = vel;
	}
}
