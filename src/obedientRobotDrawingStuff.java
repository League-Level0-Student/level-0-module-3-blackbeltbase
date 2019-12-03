import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobotDrawingStuff {
	
public static void main(String[] args) {
	Robot robot = new Robot();
	robot.penDown();
	robot.setSpeed(100);
drawSquare(robot);
	robot.move(100);
drawTriangle(robot);
robot.penUp();
robot.move(200);
robot.turn(-120);
robot.move(100);
robot.penDown();
drawCircle(robot);
robot.penUp();
robot.moveTo(500, 500);
robot.setAngle(90);
String userShape = JOptionPane.showInputDialog("Which shape do you want to draw?");
String userColor = JOptionPane.showInputDialog("which color do you want it to draw in? (blue, red, or yellow)");
colorSelector(userColor,robot);
if(userShape.equalsIgnoreCase("square")) {
	drawSquare(robot);
}
else if(userShape.equalsIgnoreCase("triangle")) {
	drawTriangle(robot);
}
else if(userShape.equalsIgnoreCase("circle")) {
	drawCircle(robot);
}
else {
	JOptionPane.showMessageDialog(null, "not a valid shape");
}

}
static void drawSquare(Robot r) {
	for(int i = 0;i<=4;i++) {
r.move(100);
r.turn(90);
	}
}
static void drawTriangle(Robot r2) {
	for(int i = 0;i<=4;i++) {
		r2.move(100);
		r2.turn(120);
	}
}
static void drawCircle(Robot r3) {
	for(int i = 0; i<=360; i++) {
		r3.move(1);
		r3.turn(1);
	}
}
static void colorSelector( String desiredColor, Robot r4) {
	if(desiredColor.equalsIgnoreCase("red")) {
r4.setPenColor(Color.red);	
	}
	else if(desiredColor.equalsIgnoreCase("blue")) {
		r4.setPenColor(Color.blue);
	}
	else if(desiredColor.equalsIgnoreCase("yellow")) {
		r4.setPenColor(Color.yellow);
	}
	else {
		r4.setRandomPenColor();
	}
}
}
