package minggu.pkg5.kasus.pkg2;

public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan (String namaMakanan, double hargaMakanan, int Stok)
    {
        this.nama_makanan = namaMakanan;
        this.harga_makanan = hargaMakanan;
        this.stok= Stok;
    }
    public String getNama_Makanan()
    {
        return nama_makanan;
    }
    public int getStok()
    {
        return stok;
    }
    public void tampilMakanan()
    {
        System.out.println(nama_makanan+"["+stok+"]"+"Rp."+harga_makanan);
    }
    public void kurangiStok(int jumlah)
    {
        stok -= jumlah;
    }
}
