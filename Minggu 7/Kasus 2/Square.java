package minggu.pkg7.kasus.pkg2;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side,side);
    }
    public Square (double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getArea() {
        return super.getArea();
    }
    public double getPerimeter() {
        return super.getPerimeter();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString() {
        return "A Square with side = "+getSide()+"which is a subclass of " 
                + super.toString();
    }
}

