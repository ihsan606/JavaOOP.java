class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "ihsan";
        child.DoIt();
        System.out.println(child.name);

        // cast child ke parent
        Parent parent = (Parent) child;
        parent.DoIt();//dalam method everriding, walaupun tipe sudah diubah ke parent tapi tetap mengakses
        //method dari child nya, karena terbentuk dari object child
        System.out.println(parent.name); //dalam kasus variable hiding justru yang diakses adalah fild dari
        //method parentnya

    }
}
