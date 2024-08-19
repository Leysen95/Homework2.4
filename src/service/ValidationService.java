package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class ValidationService {

    public static void validate(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException(login);
        }
        if (login.matches("[a-zA-Z0-9_]")) {
            throw new WrongLoginException(login);
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
        if (password.length() > 20) {
            throw new WrongPasswordException(password, password.length());
        }
        if (password.matches("[a-zA-Z0-9_]")) {
            throw new WrongPasswordException(password);
        }
    }
}
