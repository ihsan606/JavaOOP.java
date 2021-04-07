package Interface;

public interface Car extends HasBrand{
    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }
}
