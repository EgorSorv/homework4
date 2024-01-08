package hw4.task2;

public class Order {
    String customerName;
    String productName;
    int amount;

    public Order(String customerName, String productName, int amount) {
        this.customerName = customerName;
        this.productName = productName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Имя клиента => " + customerName +
                ", название товара => " + productName +
                ", количество => " + amount;
    }
}
