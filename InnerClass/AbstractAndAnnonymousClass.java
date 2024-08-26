package InnerClass;

abstract class A {
    public abstract void show();
}

public class AbstractAndAnnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In Annonymous Abstract class");
            }
        };
        obj.show();
    }
}
