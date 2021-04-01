class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("ihsan");
        employee.sayHello("budi");

        employee = new Manager("budi");
        employee.sayHello("ihsan");

        employee = new VicePrecident("Dika");
        employee.sayHello("ihsan");

        sayHello(new Employee("ihsan"));
        sayHello(new Manager("ihsan"));
        sayHello(new VicePrecident("ihsan"));


    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePrecident){
            VicePrecident vicePrecident = (VicePrecident)employee;
            System.out.println("hello vp " + employee.name);
        }
        else if(employee instanceof Manager){
            Manager manager = (Manager)employee;
            System.out.println("hello manager " + employee.name);
        }
        else{
            System.out.println("hello " + employee.name);
        }

    }
}
