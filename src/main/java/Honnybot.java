package BottyMcBottface;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * BottyMcBottface - a robot by (your name here)
 */
public class Honnybot extends AdvancedRobot
{
	/**
	 * run: BottyMcBottface's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would likes
			
			setTurnGunRight(360);
			setTurnLeft(45);
			setAhead(100);
			execute();
			
			setTurnGunLeft(360);
			setTurnRight(45);
			setAhead(100);
			execute();
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
       if (event.getDistance() < 100) {
           fire(3);
       } else {
           fire(1);
       }
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {

	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnLeft(60);
		ahead(10);
	}	
}
