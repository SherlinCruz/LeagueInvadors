import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	
	
	Rocketship(){
		
	x=56;
	y=90;
	width= 22;
	height= 36;
	
		
	}
	void update(){
		
		
	}
	
	void draw(Graphics g){
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	
}