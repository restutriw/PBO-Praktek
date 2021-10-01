/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.fundamental.pkg2;

import java.util.Scanner;

/**
 *
 * @author restu
 */
public class BukaTutupJalan {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String platNomor;
        platNomor = sc.nextLine();
        String [] nilai = platNomor.split(" ");
        String gabung = nilai[0]+nilai[1]+nilai[2]+nilai[3];
        long gabungan = Long.parseLong(gabung);
        long hasil=(gabungan-999999) % 5;
        if(hasil == 0) {
            System.out.println("Jalan");
        }else {
            System.out.println("Berhenti");
        }
    }
}
