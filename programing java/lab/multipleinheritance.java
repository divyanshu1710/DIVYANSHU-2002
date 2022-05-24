interface A {
    void method1();

    void method2();
}

interface B extends A {
    void method3();

}

class myclass implements B {
    public void method1() {

        System.out.println("chaitanya");
    }

    public void method2() {
        System.out.println("divyanshu");
    }

    public void method3() {
        System.out.println("deepak");

    }

}

public class multipleinheritance  {
    public static void main(String[] args) {
        myclass a = new myclass();
        a.method1();
        a.method2();
        a.method3();
    }
}