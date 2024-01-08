package hw4.task2.exceptions;

public class WrongProductException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Неизвестный товар. Введите название товара, которое есть в списке";
    }
}
