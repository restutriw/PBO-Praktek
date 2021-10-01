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
public class Strings {
    public static void main(String []args){
        String A,B;
        int length,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input kata : ");
        A = sc.nextLine();
        System.out.println("Input kata : ");
        B = sc.nextLine();
        
        length = A.length() + B.length();
        System.out.println("Panjang jarak A ke B adalah " +length);
        
        i=A.compareTo(B);
        if(i>0){
            System.out.println("Lexychographi : Yes");
        }else {
            System.out.println("Lexychographi : No");
        }
        A = A.substring(0,1).toUpperCase()+A.substring(1);
        B = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.printf("Kalimat yang terbentuk adalah : ");
        System.out.println(A+" "+B);
    }
}
