package hw4.task2;

import java.util.Scanner;

import static hw4.task2.Purchase.purchaseOrder;
import static hw4.task2.sub_functions.Print.printArray;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer[] customers = new Customer[3];
        Product[] products = new Product[5];
        Order[] orders = new Order[7];


        customers[0] = new Customer("Игорь", "Безруков", 34, "+7(495)000-11-22");
        customers[1] = new Customer("Алена", "Веслоухина", 26, "+7(495)111-22-33");
        customers[2] = new Customer("Олег", "Добронравов", 51, "+7(495)222-33-44");

        products[0] = new Product("Помидор", 500);
        products[1] = new Product("Батарейки", 240);
        products[2] = new Product("Яблоко", 320);
        products[3] = new Product("Конфеты", 700);
        products[4] = new Product("Салфетки", 100);

        for (int i = 0; i < orders.length; i++) {

            System.out.println("Список клиентов");
            printArray(customers);
            System.out.println();

            System.out.print("Введите имя клиента: ");
            String customerName = sc.nextLine();

            System.out.println("Список товаров");
            printArray(products);
            System.out.println();

            System.out.print("Введите название товара: ");
            String productName = sc.nextLine();

            System.out.print("Введите количество товаров: ");
            int amount = Integer.parseInt(sc.nextLine());

            orders[i] = purchaseOrder(customerName, productName, amount, products, customers);
            System.out.println();
        }

        System.out.println("Список заказов");
        printArray(orders);
    }
}
