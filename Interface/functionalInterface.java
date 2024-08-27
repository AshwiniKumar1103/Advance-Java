package Interface;

@FunctionalInterface
interface newA {
    void show(int a);
}
interface newB{
    int show(int i,int j);
}

public class functionalInterface {
    public static void main(String[] args) {
        newA obj =  a-> System.out.println("In B show "+a);
        obj.show(5);
        newB obj2 = (a,b) -> a+b;
        System.out.println(obj2.show(5, 5));
    }
}
