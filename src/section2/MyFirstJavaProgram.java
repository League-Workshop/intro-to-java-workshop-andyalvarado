package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot moon = new Robot("batman");
moon.penDown();	
for(int i=0;i<4;i++) {
moon.move(100);	
moon.turn(90);
}
}
	
	
	
	}

