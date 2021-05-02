package Modifier.data;

public enum Level {
    STANDARD("standard level"),
    PREMIUM("premium level"),
    VIP("VIP level");

    private String description;
    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
