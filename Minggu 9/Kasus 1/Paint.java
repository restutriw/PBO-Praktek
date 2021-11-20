package minggu.pkg9.kasus.pkg1;

public class Paint {
    private double coverage;
    
    public Paint(double _coverage){
        coverage = _coverage;
    }
    public double amount(Shapes s){
        System.out.println("Computing amount for "+s);
        return s.area()/coverage;
    }
}

