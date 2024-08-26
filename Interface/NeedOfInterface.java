package Interface;

interface computer{
    void show();
}
class laptop implements computer{
    public void show(){
        System.out.println("Laptop coding");
    }
}
class desktop implements computer{
    public void show() {
        System.out.println("Desktop coding");
        
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
        computer Lap = new laptop();
        computer Desk = new desktop();
        Lap.show();
        Desk.show();
    }
}
