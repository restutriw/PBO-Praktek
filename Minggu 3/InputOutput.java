package java.fundamental.pkg2;

import java.util.Scanner;
/**
 *
 * @author restu
 */
public class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata;
        kata= sc.nextLine();
        String[] temp = kata.split("\\ |!|,|\\?|\\.|\\_|\\@|'");
        System.out.println(temp.length);
        kata=kata.replaceAll("\\'","\n");
        kata=kata.replaceAll(" ","\n");
        System.out.println(kata);
    }
    
}
