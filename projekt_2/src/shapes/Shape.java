
package shapes;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape {
    protected Color color;
    protected Point center;

    public Shape(Color color, Point center) {
        this.color = color;
        this.center = center;
    }
    public abstract void draw(Graphics2D g2d);
}
