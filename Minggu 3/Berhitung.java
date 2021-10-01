package java.fundamental.pkg2;

import java.util.Scanner;
/**
 *
 * @author restu
 */
public class Berhitung {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int hasil;
        input = sc.nextLine();
        String [] nilai = input.split(" ");
        int A = Integer.parseInt(nilai[0]);
        int B = Integer.parseInt(nilai[2]);
        if(1<=A && B<=1000) {
            switch (nilai[1]) {
                case "+":
                    hasil= A+B;
                    System.out.println(hasil);
                    break;
                case "-":
                    hasil= A-B;
                    System.out.println(hasil);
                    break;
                case "*":
                    hasil= A*B;
                    System.out.println(hasil);
                    break;
                case "/":
                    hasil= A/B;
                    System.out.println(hasil);
                    break;
                case "%":
                    hasil= A%B;
                    System.out.println(hasil);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }else {
            System.out.println("Inputan salah! Silakan ulangi");
        }
    }
}
