/*
 * Author: Milan Chandra
 * Date: 12/06/24
 * Description: Has all the methods and charecteristics for the paddle
 */
import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	private int y;
	private int x;
	private int width;
	private int height;
	private int velocity;
	//don't forget you need instance variables:
	
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	public int getY(){
		return y;
	}

	public int getX(){
		return x;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}

	public void setX(int x){
		this.x = x;
	}
	
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}

	public void addVelocity(int velocity){
		this.velocity = this.velocity + velocity;
	}

	//precondition: none
	//postcondition: makes the paddle
	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}

	//precondition: none
	//postcondition: moves the paddle
	public void move(){
		x = x+ velocity;
		if (x > 585){
			x = 585;
		}
		if (x < 0){
			x = 0;
		}
	}
}
