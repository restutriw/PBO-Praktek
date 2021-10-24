package association;

/**
 *
 * @author restu
 */
public class Association {

    public static void main(String[] args) {
        MataKuliah matkulObj = new MataKuliah("Pancasila");
        Dosen dosenObj = new Dosen("Ade Engkus Kusnadi");
        System.out.println(dosenObj.getNamaDosen()+
        " adalah dosen mata kuliah " + matkulObj.getNamaMataKuliah());
    }
    
}
