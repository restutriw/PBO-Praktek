/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4.kasus.pkg3;

/**
 *
 * @author restu
 */
    class KelasDua{
        static 
        {
            System.out.println(5);
        }

        public static void main(String[] args)
        {
            System.out.println(6);
            KelasSatu satu = new KelasSatu(); 
            KelasSatu dua = new KelasSatu(10);
        }
    }