package Modifier.data;

import Modifier.data.util.MathUtil;

public class StaticAPP {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5,6,7,8,9)
        );

        Country.city kota = new Country.city();
        kota.setName("Soul");
        System.out.println(kota.getName());

        System.out.println(Application.PROCESSOR);
    }
}
