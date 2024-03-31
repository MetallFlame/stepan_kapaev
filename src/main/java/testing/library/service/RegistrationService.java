package testing.library.service;

import testing.library.exception.WrongLoginException;
import testing.library.exception.WrongPasswordException;

public class RegistrationService {
    public boolean signIN(String login, String password, String password2){
        if (login.length() > 20){
            try {
                throw new WrongLoginException("Неверная длина логина");
            } catch (WrongLoginException exception) {
                System.out.println(exception.getMessage());
            }
            return false;
        }
        if (password.length() > 20){
            try {
                throw new WrongPasswordException("Неверная длина пароля");
            } catch (WrongPasswordException exception) {
                System.out.println(exception.getMessage());
            }
            return false;
        }
        if (!password.equals(password2)){
            try {
                throw new WrongPasswordException("Неверная проверка пароля");
            } catch (WrongPasswordException exception) {
                System.out.println(exception.getMessage());
            }
            return false;
        }
        else {
            return true;
        }
    }
}
