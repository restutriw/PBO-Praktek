package minngu.pkg10.kasus.pkg3;

import java.util.Scanner;

public class TextField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Input an integer number: ");
            int i = sc.nextInt();
            System.out.println(i+" valid as an integer number");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
