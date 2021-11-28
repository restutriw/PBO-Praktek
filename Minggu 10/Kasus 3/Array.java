package minngu.pkg10.kasus.pkg3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        try{
            System.out.println("Enter value of element array: ");
            int e = sc.nextInt();
            System.out.println("Enter index of array: ");
            int i = sc.nextInt();
            arr[i] = e;

            System.out.println("array["+i+"] = "+arr[i]);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
