package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File
		String shapetype = in.next();
		int Red = in.nextInt();
		int Green = in.nextInt();
		int Blue = in.nextInt();
		boolean Filled = in.nextBoolean();
		double Xmidpoint = in.nextDouble();
		double Ymidpoint = in.nextDouble();
		double width = in.nextDouble();
		double height = in.nextDouble();
		double[] x = {0.8, 0.6,0.3};
		double[] y = {0.2, 0.5, 0.2 };

		StdDraw.setPenColor(Red, Green, Blue);
		StdDraw.setPenRadius(.1);
		if(shapetype.equals("ellipse")){
		if (Filled == true) {
			StdDraw.filledEllipse(Xmidpoint, Ymidpoint, width, height);
		
		}else {StdDraw.ellipse(Xmidpoint, Ymidpoint, width, height);
		}
	}
	else if(shapetype.equals("rectangle")){
		if (Filled == true) {
			StdDraw.filledRectangle(Xmidpoint, Ymidpoint, width, height);
		
		}else {StdDraw.rectangle(Xmidpoint, Ymidpoint, width, height);
		}
	}	else if(shapetype.equals("triangle")){
		if (Filled == true) {
			StdDraw.filledPolygon(x,y);
		
		}else {StdDraw.polygon(x,y);
		}

	}
}
}
