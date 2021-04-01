class ManagerApp
{
    public static void main(String[] args) {
        Manager manager = new Manager("ihsan");
        manager.sayHello("budi");

        VicePrecident vp = new VicePrecident("budi");
        vp.sayHello("ihsan");
    }
}
