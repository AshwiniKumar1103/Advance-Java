package Enum;

enum Laptop {
    Macbook(2000), HP(1000), Lenovo(5000), Acer;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int _price) {
        price = _price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        Laptop Lap = Laptop.Lenovo;
        System.out.println(Lap.getPrice());
        for (Laptop _Lap : Laptop.values()) {
            System.out.println(_Lap + " : " + _Lap.getPrice());
        }
    }
}
