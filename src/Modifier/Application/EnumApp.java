package Modifier.Application;

import Modifier.data.Custumer;
import Modifier.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Custumer custumer = new Custumer();
        custumer.setName("ihsan");
        custumer.setLevel(Level.PREMIUM);
        System.out.println(custumer.getName());
        System.out.println(custumer.getLevel());
        System.out.println(custumer.getLevel().getDescription());

        //casting dari enum ke String
        String nameLevel = Level.STANDARD.name();
        System.out.println(nameLevel);
        System.out.println("\nPrint level");
        for(var i: Level.values()){
            System.out.println(i);
        }
    }
}
