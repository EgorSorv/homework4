package hw4.task1;

public class WrongLoginException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Длина логина не должна превышать 20 символов";
    }
}
