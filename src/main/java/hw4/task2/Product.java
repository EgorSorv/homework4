package hw4.task2;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название товара => " + name +
                ", стоимость => " + price;
    }

    public String getName() {
        return name;
    }
}
