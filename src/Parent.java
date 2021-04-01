class Parent {
    String name;

    void DoIt(){
        System.out.println("do it in parent");
    }
}

class Child extends Parent{
    String name= "hang";  //variable hiding dengan variable name di parent nya
    void DoIt(){  //method ini akan meng override terhadap class parent karena memiliki nama yang sama
        System.out.println("do it in from child");
        System.out.println("parent name is " + super.name);
    }

}
