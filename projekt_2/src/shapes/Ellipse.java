
package shapes;
import java.awt.*;


public class Ellipse extends Shape{
    protected int semiMajorAxis;
    protected int semiMinorAxis;

    public Ellipse(Color color, Point center, int semiMajorAxis, int semiMinorAxis) {
        super(color, center);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

 
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    
    public double getPerimeter() {
        // Approximation of ellipse perimeter
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }

    
    public Shape getCircumscribedRectangle(Color color) {
        return new Rectangle(color, center, semiMajorAxis*2, semiMinorAxis*2);
    }
    
    public Shape getInscribedCircle(Color color){
        int diameter = Math.min(semiMajorAxis, semiMinorAxis) * 2;
        // The center of the inscribed circle is the same as the center of the ellipse
        return new Circle(color, center, diameter / 2);
    }
    
    @Override
    public void draw(Graphics2D g2d){
        int x = center.getX() - semiMajorAxis ;
        int y = center.getY() - semiMinorAxis ;
        
        g2d.setColor(color);
        g2d.fillOval(x, y, semiMajorAxis*2, semiMinorAxis*2);
    }

    @Override
    public String toString() {
        String type = "Ellipse";
        if(semiMajorAxis == semiMinorAxis){
            type = "Circle";
        }
        String colorString = "[rgb " + color.getRed() + ":" + color.getGreen() + ":" + color.getBlue() + "]";
        return type + ", area: " + (int)getArea() +
                "\n" +
                "color: " + colorString +
                ", center: " + center +
                ", [ax1:" + semiMajorAxis +
                ", ax2:" + semiMinorAxis +
                ']';
    }
}
