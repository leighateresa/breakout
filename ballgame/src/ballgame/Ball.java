package ballgame;
import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		// Set width and height of the ball
		width = Settings.BALL_WIDTH;
		height = Settings.BALL_HEIGHT;
		// Call resetPosition
		resetPosition();
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		// Set the balls y by using the INITIAL_BALL_Y
		setY(Settings.INITIAL_BALL_Y);
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			x = 0;
			xVelocity = 1;
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - width) {
			x = Settings.WINDOW_WIDTH - width - 16;
			xVelocity = -1;
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			// Set y to 0 so it does not leave the screen
			y = 0;
			// Change the y velocity to make the ball go downward
			yVelocity = 1;
		}
		
	}
	
	public void setXVelocity(int x) {
		// Set the x velocity
		xVelocity = x;
	}
	public void setYVelocity(int y) {
		// Set the y velocity
		yVelocity = y;
	}
	
	public int getXVelocity() {
		return xVelocity;	// Return the x velocity
		
	}
	public int getYVelocity() {
		return yVelocity;	// Return the y velocity
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, width, height);
	}
}
