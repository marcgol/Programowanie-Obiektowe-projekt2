package shape;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle extends Ellipse{
    
    public Circle(){
        super();
        name = "Circle";
    }
    
    public Circle(Color color, Point center, double radius){
        super(color, center, radius, radius);
        name = "Circle";
    }
    
    @Override
    protected void getExtraData(JFrame frame){
        ax1 = Double.parseDouble(JOptionPane.showInputDialog(frame, "Enter the radius", "105")); 
        ax2 = ax1;
    }
    
    public Square getCircumscribedSquare(Color color){
        return new Square(color, center,ax1*2);     
    }
    
}
