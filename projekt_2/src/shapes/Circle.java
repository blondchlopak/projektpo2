
package shapes;
import java.awt.Color;

public class Circle extends Ellipse{

    public Circle(Color color, Point center, int radius) {
        super(color, center,radius, radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * semiMajorAxis;
    }

    
    public Shape getCircumscribedSquare(Color color) {
        
        return new Square(color, center, 2*semiMajorAxis);
    }
}
