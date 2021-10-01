/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg2;

import java.util.Scanner;

/**
 *
 * @author restu
 */
public class DataTypes {
     public static void main(String []argh)
    {
        int frekuensi, nilai, index;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input jumlah frekuensi : ");
        frekuensi=sc.nextInt();

        for(index=0; index<frekuensi; index++)
        {
            try
            {
                System.out.printf("Input nilai : ");
                nilai=sc.nextInt();
                System.out.println(nilai+" can be fitted in: ");
                if(nilai>=-128 && nilai<=127) {System.out.println("* byte");}
                if(nilai>=Short.MIN_VALUE && nilai<=Short.MAX_VALUE){System.out.println("* short");}
                if(nilai>=Integer.MIN_VALUE && nilai<=Integer.MAX_VALUE){System.out.println("* int");}
                if(nilai>=Long.MIN_VALUE && nilai<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
