import java.awt.*;
/*
 * Author: Milan Chandra
 * Date: 12/06/24
 * Description: Has all the methods and charecteristics for the ball
 */
public class Ball {
	//your code here!
	private int y;
	private int x;
	private int size;
	private int yVelocity = -1;
	private int xVelocity = 1;

	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
	}
	//don't forget you need instance variables:
	
	
	//constructor(s):
	
	//methods:
	public int getYpos(){
		return y;
	}

	public int getXpos(){
		return x;
	}

	public int getSize(){
		return size;
	}

	public int getYVelocity(){
		return yVelocity;
	}

	public int getXVelocity(){
		return xVelocity;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	//precondition: none
	//postcondition: x velocity is reversed
	public void reverseX(){
		xVelocity = xVelocity* -1;
	}

	//precondition: none
	//postcondition: y velocity is reversed
	public void reverseY(){
		yVelocity = yVelocity* -1;
	}
	
	//precondition: none
	//postcondition: draws the ball
	public void draw(Graphics g){
		g.fillOval(x, y, size, size);
	}

	//precondition: none
	
	//postcondition: moves ball. If on the edge, it'll bounce
	public void move(){
		x = x+ xVelocity;
		y = y+ yVelocity;
		if(x > 512){
			x = 512;
		}
		if(x > 512){
			x = 512;
		}
	}
}
