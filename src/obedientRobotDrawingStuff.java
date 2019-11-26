import org.jointheleague.graphical.robot.Robot;

public class obedientRobotDrawingStuff {
	
public static void main(String[] args) {
	Robot robot = new Robot();
	robot.penDown();
	robot.setSpeed(100);
	for(int i = 0;i<=4;i++) {
robot.move(100);
robot.turn(90);
	}
	robot.penUp();
	robot.move(100);
	robot.penDown();
	for(int i = 0;i<=4;i++) {
		robot.move(100);
		robot.turn(120);
	}
}
void drawSquare(Robot r) {
	r.penDown();

	for(int i = 0;i<=4;i++) {
r.move(100);
r.turn(90);
	}
}
}
