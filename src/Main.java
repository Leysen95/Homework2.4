import exception.WrongLoginException;
import exception.WrongPasswordException;

import static service.ValidationService.validate;

public class Main {

    public static void main(String[] args) {
        try {
            validate("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.print("Данные заполнены верно");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}