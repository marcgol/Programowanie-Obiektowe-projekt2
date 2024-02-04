package shape;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Square extends Rectangle{
    
    public Square(){
        super();
        name = "Square";
    }
    
    public Square(Color color, Point center, double side){
        super(color, center, side, side);
        name = "Square";
    }
    
    @Override
    protected void getExtraData(JFrame frame){
        a = Double.parseDouble(JOptionPane.showInputDialog(frame,
                "Enter side length: ", "80"));
        b = a;       
    }
    
    public Circle getInscribedCircle(Color color){
        return new Circle(color, center, a/2);
    }    
}
