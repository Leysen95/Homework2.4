package exception;

public class WrongLoginException extends RuntimeException {

  private String login;

  public WrongLoginException(String login) {
    super("Используются недопустимые символы: %s".formatted(login));
    this.login = login;
  }

  public WrongLoginException(String login, int length) {
    super("Слишком длинный логин: %s".formatted(login, length));
    this.login = login;
  }
}
