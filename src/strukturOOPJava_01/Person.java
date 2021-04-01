package strukturOOPJava_01;

class Person {
    String name;
    String addres;
    final String County ="indonesia";


    Person(String name, String addres){
        this.name = name;
        this.addres = addres;

    }
    Person(String name){
        this(name,null);
    }


}
