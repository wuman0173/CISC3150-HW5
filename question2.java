/*
Benjamin Wu
CISC 3150 - HW5 - Question 5

Comments: setting the radius to 1 for answer to PI.

A simple way of computing PI using the Monte Carlo Simulation Source Code...
http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/07/compute-pi.html

Not much I can change...

Standard Form of a Circle is x^2 + y^2 = 1. Anything inside that compared to the total amount of points hit is PI.
https://www.mathsisfun.com/algebra/circle-equations.html
*/

import java.lang.Math.*;

class question2
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		System.out.println("The PI Number is: " + Math.PI);
		
		long i = 0, InsideCircleCounter = 0;
		double x, y;
		while(i < 4000000000L)
			{
			x = Math.random();
			y = Math.random();
			//Math.random gives a random number between 0.0 and 1.0.
			//This simulates plotting 4 billion points within the range of the square that has width/length of 0 to 1.
			//The Area of Circle with Origin (0,0)... Area of Circle Radius 1 = PI. 
			//The Standard Form of a circle is: x^2 + y^2 = 1
			
			if ((Math.pow(x,2) + Math.pow(y,2)) < 1)
				{
				InsideCircleCounter = InsideCircleCounter + 1;
				}
			i++;
			}
		double everything = (InsideCircleCounter/4000000000L);
		System.out.println("Loop ran 4,000,000,000 times, InsideCircleCounter is: " + InsideCircleCounter);
		System.out.println("1/4 of hitting inside Quadrant One of the Circle is: " + (InsideCircleCounter/4.0));
		System.out.println("The Probability of hitting inside the Fourth Quadrant of the Circle is " + everything);
	
		System.out.println("Area of 1/4 of a Circle with Radius of 1 is: (Pi*r^2)/4... which is: " + ((Math.PI*Math.pow(1,2))/4));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time for program to complete: " + totalTime);
	}
}
