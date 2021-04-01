class Manager extends Employee
{

    Manager(String nama){
        super(nama);

    }


    void sayHello(String name){
        System.out.println("hi "+ name +", my name is manager "+ this.name);

    }
}

