package composite;

/**
 *
 * @author restu
 */
public class Composite {

    public static void main(String[] args) {
        Karyawan ceo = new Karyawan("Restu Triwahyuny","CEO",50000000);
        
        Karyawan headSales = new Karyawan("Rifki Yusran", "Head Sales",5000000);
        
        Karyawan headMarketing = new Karyawan("Safna Anbiya","Head Marketing",5000000);
        
        Karyawan marketing1 = new Karyawan("Salma Aulia","Marketing",3000000);
        Karyawan marketing2 = new Karyawan("Tegar Faris","Marketing",3000000);
        
        Karyawan sales1 = new Karyawan("Thoriq Fadhilah","Sales",3000000);
        Karyawan sales2 = new Karyawan("Yoga Nizar","Sales",3000000);
        
        ceo.add(headSales);
        ceo.add(headMarketing);
        
        headMarketing.add(marketing1);
        headMarketing.add(marketing2);
        
        headSales.add(sales1);
        headSales.add(sales2);
        
        System.out.println(ceo);
        
        for(Karyawan headKaryawan : ceo.getSubordinates()){
            System.out.println();
            System.out.println(headKaryawan);
     
            for(Karyawan Karyawan : headKaryawan.getSubordinates()){
                System.out.println(" - "+Karyawan);
            }
        }
    }
    
}
