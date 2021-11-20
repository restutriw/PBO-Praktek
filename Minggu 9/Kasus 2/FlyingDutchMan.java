package minggu.pkg9.kasus.pkg2;

public class FlyingDutchMan extends SuperHero{
    public FlyingDutchMan(int powerLevel, String name){
        super(powerLevel, name);
        Power laser = new LaserEye();
        Power flying = new Flying();
        addPower(flying);
        addPower(laser);
    }
    public void identity(){
        System.out.printf("It's %s, the FlyingDutchMan! It has the power "
                + "level of %d\n",this.name,this.powerLevel);
        System.out.println(".....HEED ME.....");
    }
}

