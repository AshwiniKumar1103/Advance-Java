abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("playing music");
    }
}

class BMW extends Car {
    public void drive() {
        System.out.println("driving");
    }

    public void playMusic() {
        System.out.println("playing music");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Car obj = new BMW();
        obj.drive();
        obj.playMusic();
    }
}