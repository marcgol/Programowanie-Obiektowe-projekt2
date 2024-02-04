package shape;

public class Point implements Cloneable {
    final public static double PRECISION = 0.001;
    public double x;
    public double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "["+ (int) x + "," + (int) y +"]";
    }
    
    private boolean compare(double a, double b){
        return (Math.abs(a-b)) < PRECISION;
    }
    
    public boolean equals(Point obj){
        return compare(x, obj.x) && compare(y, obj.y);
    }
    
    public Point multiply(double k){
        return new Point(k*x, k*y);
    }
    
    public Point add(Point p){
        return new Point(x + p.x, y + p.y);
    }
    
    public Point subtract(Point p){
        return new Point(x - p.x, y - p.y);
    }
    
    public Point midPoint(Point a, Point b){
        return (a.add(b)).multiply(0.5);
    }
    
    public static Point vector(Point a, Point b){
        return (b.subtract(a));
    }
    
    public double vecLength(){
        return Math.sqrt(x*x+y*y);
    }
    
    public Point rotate(double angle, Point center){
        return new Point(center.x *Math.cos(angle) - center.y*Math.sin(angle),
        center.x *Math.sin(angle) + center.y*Math.cos(angle));
    }
    
    @Override
    public Point clone(){
        return new Point(x, y);
    }
}
