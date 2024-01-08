package hw4.task2;

import hw4.task2.exceptions.WrongAmountException;
import hw4.task2.exceptions.WrongCustomerException;
import hw4.task2.exceptions.WrongProductException;

import static hw4.task2.sub_functions.Find.*;

public class Purchase {
    public static Order purchaseOrder(String nameCustomer, String nameProduct, int amount,
                                      Product[] products, Customer[] customers) {
            try {
                    if (!findCustomer(customers, nameCustomer))
                        throw new WrongCustomerException();
                    else if (!findProduct(products, nameProduct))
                        throw new WrongProductException();
                    else if (amount <= 0)
                        throw new WrongAmountException();
                    else {
                        return new Order(nameCustomer, nameProduct, amount);
                    }
            } catch (WrongCustomerException e) {
                System.out.println(e.getMessage());
            } catch (WrongProductException e) {
                System.out.println(e.getMessage());
            } catch (WrongAmountException e) {
                System.out.println(e.getMessage());
            }
            return null;
        }
    }
