package minngu.pkg10.kasus.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OperasiFile {
    public static void main(String[] args) {
        String fName = "test.txt";
        
        try{
            File file = new File(fName);
            Scanner fread = new Scanner(file);

            while(fread.hasNextLine()){
                String dataFile = fread.nextLine();
                System.out.println(dataFile);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
