package InnerClass;

class A {
    public void show() {
        System.out.println("in A class");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B class");
    }
}

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Annonymous Inner Class");
            }
        };
        obj.show();
    }
}
