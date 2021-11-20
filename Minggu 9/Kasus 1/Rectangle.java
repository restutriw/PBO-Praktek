package minggu.pkg9.kasus.pkg1;

public class Rectangle extends Shapes{
    private double length;
    private double width;
    public Rectangle(double _length, double _width){
        super("Rectangle");
        this.length = _length;
        this.width = _width;
    }
    public double area(){
        return length*width;
    }
    public String toString(){
        return super.toString()+" of length "+this.length+" and width "+this.width;
    }
}

