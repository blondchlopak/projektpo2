
package shapes;
import java.awt.Color;
import java.awt.Graphics2D;


public class Rectangle extends Shape{
    protected int width;
    protected int height;

    public Rectangle(Color color, Point center, int width, int height) {
        super(color, center);
        this.width = width;
        this.height = height;
    }

    
    public double getArea() {
        return width * height;
    }

    
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    public Shape getCircumscribedCircle(Color color) {
        double radius = Math.sqrt((width * width + height * height)) / 2;
        return new Circle(color, center, (int)radius);
    }
    
    

    @Override
    public String toString() {
        String type = "Rectangle";
        if(width == height){
            type = "Square";
        }
        String colorString = "[rgb " + color.getRed() + ":" + color.getGreen() + ":" + color.getBlue() + "]";
        return type + ", area: " + (int)getArea() +
                "\n" +
                "color: " + colorString +
                ", center: " + center +
                ", [a:" + width +
                ", b:" + height +
                ']';
    }

    @Override
    public void draw(Graphics2D g2d){
        int x = center.getX() - width / 2;
        int y = center.getY() - height / 2;
        g2d.setColor(color);
        g2d.fillRect(x, y, width, height);
    }
}
