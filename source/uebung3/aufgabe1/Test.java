package uebung3.aufgabe1;

public class Test {
    public static void main (String[] args) {
        C1 a=new C2();
        C2 b=new C2();
        ((C2) a).f1();
        ((C1) b).f1();
        System.out.println(a.s);
        b.f1();
        b.f2();
        b.f3();
//        C1 c = new C1(); c.f3();
//        C1 c = new C1(); ((C2) c).f1();
    }
}

/*
1.  C2::f1
2.  C2::f1
3.  1
4.  C2::f1
5.  C1::f2
6.  C2::f3
7.  Compile-/Runtime-Error
8.  Compile-/Runtime-Error
*/