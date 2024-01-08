package hw4.task1;

public class WrongPasswordException extends RuntimeException {
    private final int passwordLen;

    public WrongPasswordException(int passwordLen) {
        super();
        this.passwordLen = passwordLen;
    }

    @Override
    public String getMessage() {
        if (passwordLen >= 20) return "Пароль не должен превышать 20 символов";
        else return "Введенные пароли не совпадают";
    }
}
