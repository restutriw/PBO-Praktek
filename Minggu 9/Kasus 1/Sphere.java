package minggu.pkg9.kasus.pkg1;

public class Sphere extends Shapes{
    private double radius;
    
    public Sphere(double _radius){
        super("Sphere");
        radius = _radius;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    public String toString(){
        return super.toString()+" of radius "+radius;
    }
}

