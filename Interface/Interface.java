package Interface;

interface A {
    void show();

    void config();
}

interface X {
    void run();
}

class B implements A, X {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in A show");
    }

    public void run() {
        System.out.println("Running");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
    }
}
