package minggu.pkg10.kasus.pkg2;

import java.util.Scanner;

public class Minggu10Kasus2 {

    public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		try {
                    int hex = input.nextInt(16);
                    System.out.println(Integer.toHexString(hex)+
                            " is a hexadecimal value of "+hex);
		}catch(Exception ex) {
			System.out.println(ex+": isn't a valid hexadecimal number");
		}
	}
}

