package java.fundamental.pkg2;

import java.util.Scanner;
/**
 *
 * @author restu
 */
public class GajiAgent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji=500000, hargaItem=50000, itemTerjual=0, bonus=0, denda=0;
        itemTerjual=sc.nextInt();
        if(itemTerjual>=40 && itemTerjual < 80) {
            bonus=itemTerjual*hargaItem*25/100;
            gaji=gaji+bonus;
            System.out.println(gaji);
        }else if(itemTerjual>=80) {
            bonus=itemTerjual*hargaItem*35/100;
            gaji=gaji+bonus;
            System.out.println(gaji);
        }else if(itemTerjual<15) {
            denda=(15-itemTerjual)*hargaItem*15/100;
            gaji=gaji-denda;
            System.out.println(gaji);
        }else {
            bonus=itemTerjual*hargaItem*10/100;
            gaji=gaji+bonus;
            System.out.println(gaji);
        }
    }
}
