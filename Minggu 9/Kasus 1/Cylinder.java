package minggu.pkg9.kasus.pkg1;

public class Cylinder extends Shapes{
    private double radius;
    private double height;
    public Cylinder(double _radius, double _height){
        super("Cylinder");
        this.radius = _radius;
        this.height = _height;
    }
    public double area(){
        return Math.PI*radius*radius*height;
    }
    public String toString(){
        return super.toString()+" of radius "+radius+" and height "+height;
    }
}



