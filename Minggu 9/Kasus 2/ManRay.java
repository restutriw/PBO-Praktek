package minggu.pkg9.kasus.pkg2;

public class ManRay extends SuperHero{
    public ManRay(int powerLevel, String name){
        super(powerLevel, name);
        Power laser = new LaserEye();
        Power strength = new Strength();
        addPower(laser);
        addPower(strength);
    }
    public void identity(){
        System.out.printf("It's %s, the ManRay! It has the power "
                + "level of %d\n",this.name,this.powerLevel);
        System.out.println(".....HEED ME.....");
    }
}


