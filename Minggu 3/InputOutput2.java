package java.fundamental.pkg2;

import java.util.Scanner;
/**
 *
 * @author restu
 */
public class InputOutput2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] huruf = new String[3];
        int[] angka = new int [3];
        for(int i=0; i < huruf.length; i++){
            huruf[i] = sc.next();
            angka[i] = sc.nextInt();
        }
        System.out.println("====================");
        for(int j=0; j<huruf.length; j++){
            System.out.printf("%-14s %03d\n", huruf[j],
            angka[j]);
        }
        System.out.println("====================");
    }
}
