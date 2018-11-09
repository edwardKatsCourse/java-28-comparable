package com.company;

public class InheritanceDemo {
    public static void main(String[] args) {
        Comparable<Z> z = new Z();
//        z.method();
    }
}

class Z implements Comparable<Z> {
    public void method() {}
    @Override
    public int compareTo(Z o) {
        return 0;
    }
}

class A extends Object {
    public void a() {
    }
}

class B extends A {
    public void b() {
    }
}

class C extends B {
    public void c() {
    }
}
