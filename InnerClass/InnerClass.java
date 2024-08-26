package InnerClass;

class A {
    public void show() {
        System.out.println("in A class");
    }

    static class B {
        public void show() {
            System.out.println("In B class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = new A.B();
        obj2.show();
    }
}
