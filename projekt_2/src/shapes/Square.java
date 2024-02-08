
package shapes;

import java.awt.Color;


public class Square extends Rectangle{
    public Square(Color color, Point center, int sideLength) {
        super(color, center, sideLength, sideLength);
    }
    
    public Shape getInscribedCircle(Color color){
        int diameter = width;
        
        return new Circle(color, center, diameter / 2);
    }
    
    
}
