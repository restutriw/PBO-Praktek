/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.fundamental.pkg2;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author restu
 */
public class BigNumber {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger x,y;
        x=sc.nextBigInteger();
        y=sc.nextBigInteger();
        BigInteger nilai1=x.add(y), nilai2=x.multiply(y);
        System.out.println(nilai1);
        System.out.println(nilai2);
    }
}
