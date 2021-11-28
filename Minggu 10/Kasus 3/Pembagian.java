package minngu.pkg10.kasus.pkg3;

public class Pembagian {

    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        
        try{
            System.out.println(a/b);
        }catch(Exception ex){
            System.out.println("Divided by zero operation cannot possible");
        }
    }  
}
