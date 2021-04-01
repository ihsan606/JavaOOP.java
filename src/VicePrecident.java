class VicePrecident extends Manager
{

    VicePrecident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("hi "+ name +", my name is vp "+ this.name);

    }
}
