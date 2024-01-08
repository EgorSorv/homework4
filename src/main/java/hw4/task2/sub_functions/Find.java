package hw4.task2.sub_functions;

import hw4.task2.Customer;
import hw4.task2.Product;

import java.util.Objects;

public class Find {
    public static boolean findCustomer(Customer[] array, String name) {
        boolean result = false;

        for (Customer value : array) {
            if (Objects.equals(name, value.getName())) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static boolean findProduct(Product[] array, String name) {
        boolean result = false;

        for (Product value : array) {
            if (Objects.equals(name, value.getName())) {
                result = true;
                break;
            }
        }

        return result;
    }
}
