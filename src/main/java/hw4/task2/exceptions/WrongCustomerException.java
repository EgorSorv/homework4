package hw4.task2.exceptions;

public class WrongCustomerException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Неизвестный клиент. Введите имя клиента, которое есть в списке";
    }
}
