/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg4;

/**
 *
 * @author restu
 */
public final class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        setStok(stk);
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        if(stok>=0){
            this.stok += stok;
        }
    }
}
