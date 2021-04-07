package Interface;

public class Avanza implements Car,isMantanence{

    public void drive() {
        System.out.println("Avanza Drive");
    }


    public int getTier() {
        return 4;
    }


    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMantanence() {
        return false;
    }
}
