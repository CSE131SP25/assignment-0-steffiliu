package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(120);
		//robot.forward(60);
		int x = 0;
		int y = 8;
		int u = 0;
		int d = 0;
		while (x < 10)
		{
			robot.turnLeft(90);
			robot.forward(15);
			robot.turnRight(90);
			robot.forward(15);
			x++;
		}
		robot.forward(80);
	
			while(y>4)
			{
			robot.turnRight(90);
			robot.forward(15);
			robot.turnLeft(90);
			robot.forward(15);
			y--;
			}
			robot.turnRight(90);
			robot.forward(30);
		 while(y<=4 && y>=0)
		{
			robot.turnRight(90);
			robot.forward(15);
			robot.turnLeft(90);
			robot.forward(15);
			y--;
		}
		 robot.turnLeft(90);
		 robot.forward(15);
		 while(u<4)
			{
			robot.turnRight(90);
			robot.forward(15);
			robot.turnLeft(90);
			robot.forward(15);
			u++;
			}
		 robot.turnRight(90);
		 robot.forward(30);
		 while(u>=4 && u<8)
			{
				robot.turnRight(90);
				robot.forward(15);
				robot.turnLeft(90);
				robot.forward(15);
				u++;
			}
		 robot.turnRight(90);
			robot.forward(95);
			while (d < 11)
			{
				robot.turnRight(90);
				robot.forward(15);
				robot.turnLeft(90);
				robot.forward(15);
				d++;
			}
	}

}
