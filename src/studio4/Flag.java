package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(.1);
		StdDraw.setPenColor(0,255,0);
		StdDraw.filledRectangle(.5,.5,.8,.8);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledEllipse(.5,.5,0.3,0.3);
		StdDraw.setPenColor(0,0,0);
		StdDraw.text(.5, .5, "BBEG");

	}
}