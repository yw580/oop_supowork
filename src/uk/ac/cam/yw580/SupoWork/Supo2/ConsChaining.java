package uk.ac.cam.yw580.SupoWork.Supo2;

public class ConsChaining {
    public static void main(String[] args) {
        C c = new C("argument");
    }
}
/* class A {
    A() {
        System.out.println("A initialised");
    }
} */

class A {
    A(String s) {
        System.out.println("A initialised and my argument: " + s);
    }
}

class B extends A{
    B(String s) {
        super(s);
        System.out.println("B initialised");
    }
}
class C extends B{
    C(String s) {
        super(s);
        System.out.println("C initialised");
    }
}