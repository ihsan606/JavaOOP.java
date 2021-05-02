package Modifier.data;

public class EqualsApp {
    public static void main(String[] args) {
        String nama1 = "ihsan";
        String namaL = nama1 +" "+"syafiul";
        System.out.println(namaL);
        String nama2 = "ihsan syafiul";
        System.out.println(nama2);
        System.out.println(namaL.equals(nama2));
        System.out.println(namaL.hashCode()==nama2.hashCode());
    }


}
