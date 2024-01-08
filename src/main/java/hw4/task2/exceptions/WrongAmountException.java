package hw4.task2.exceptions;

public class WrongAmountException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Некорректное количество товара. Число должно быть положительным";
    }
}
