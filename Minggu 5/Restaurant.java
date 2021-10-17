package minggu.pkg5.kasus.pkg2;

public class Restaurant {

    private Makanan[] menuMakanan;
    private static byte id=0;

    public Restaurant() {
        menuMakanan = new Makanan[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.menuMakanan[id] = new Makanan (nama, harga, stok);
    }

    public void tampilMenuMakanan(){
        for(int i=0; i<=id;i++){
            if(!isOutOfStock(i)){
                this.menuMakanan[i].tampilMakanan();
            }
        }
    }

    public boolean isOutOfStock(int id){
        return menuMakanan[id].getStok() == 0;
    }

    public static void nextId(){
        id++;
    }
    
    public void order (String namaMakanan, int jumlah)
    {
        for(int i=0; i<=id; i++)
        {
            if(namaMakanan.equals(menuMakanan[i].getNama_Makanan()))
            {
                if(menuMakanan[i].getStok() >= jumlah)
                {
                    System.out.println(jumlah+" "+menuMakanan[i].getNama_Makanan()+" "+"Terjual!");
                    menuMakanan[i].kurangiStok(jumlah);
                }
                else System.out.println("Stok "+menuMakanan[i].getNama_Makanan()+" tidak cukup!");
            }
        }
    }           
}
    

