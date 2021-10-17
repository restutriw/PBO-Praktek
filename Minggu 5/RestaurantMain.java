package minggu.pkg5.kasus.pkg2;

import java.util.Scanner;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        Scanner sc = new Scanner(System.in);
        String makanan;
        int order;
        
        System.out.println("***** Menu Makanan ******");   
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        System.out.println("*************************");
        
        System.out.println("Masukkan Nama Makanan\t: ");
        makanan = sc.nextLine();
        System.out.println("Jumlah Makanan yang Dibeli\t: ");
        order = sc.nextInt();
        System.out.println("*************************");
        menu.order(makanan, order);
        System.out.println("Stok makanan tersisa");
        menu.tampilMenuMakanan();
    }
}
