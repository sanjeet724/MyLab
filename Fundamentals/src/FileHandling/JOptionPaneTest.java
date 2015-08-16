package FileHandling;

import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		String radiusStr;
		double radius, area;
		radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle: ");
		radius = Double.parseDouble(radiusStr);
		area = radius*radius*Math.PI;
		System.out.println("The area is " + area);
	}
}
