/**
 * A class for drawing a picture using the shapes
 */
package Drawing;

import Shapes.*;
import java.awt.Color;

public class MyDrawing {
    public static void main(String[] args) {
        double thickness = 0.1;
        Color color = new Color(0, 255, 255);
        Shape s = new Shape(thickness, color);
        
        Point p = new Point(thickness, color, 0.5, 0.5);
        System.out.println(p);
        p.draw();
        
        LineSegment ls = new LineSegment(0.01, new Color(255, 0, 0), 0, 0, 0.6, 0.8);
        System.out.println(ls);
        ls.draw();
        
        // TODO: Fill in code here
    }
}
