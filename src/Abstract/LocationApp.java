package Abstract;

public class LocationApp {
    //Location location = new Location(); tidak bisa diinstansiasi, karena class location merupakan
    //class abstract
    public static void main(String[] args) {
        City city = new City();
        city.name ="jakarta";
    }

}
