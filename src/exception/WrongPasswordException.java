package exception;

public class WrongPasswordException extends RuntimeException {

    private String password;

    private String confirmPassword;

    public WrongPasswordException(String password) {
        super("Используются недопустимые символы: %s".formatted(password));
        this.password = password;
    }

    public WrongPasswordException(String password, int length) {
        super("Слишком длинный пароль: %s - %s знаков".formatted(password, length));
        this.password = password;
    }

    public WrongPasswordException(String password, String confirmPassword) {
        super("Пароль: %s отличается от: %s".formatted(password, confirmPassword));
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
