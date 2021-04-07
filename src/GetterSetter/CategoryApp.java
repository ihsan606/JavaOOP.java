package GetterSetter;

public class CategoryApp {
    public static void main(String[] args) {
        Category category =new Category();
        category.setId("ihsan606");
        category.setId(null); //id tidak akan berubah karena di class category sudah kita buat validasi
        //jika id yang dimasukkan adalah null, maka id tidak akan diganti
        category.setId("jogja606");

        System.out.println(category.getId());

    }

}
