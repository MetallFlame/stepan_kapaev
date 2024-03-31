package testing.library.service;

import testing.library.model.Book;
import testing.library.model.User;
import testing.library.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    UserRepository userRepository;
    RegistrationService registrationService;

    public UserService() {
        registrationService = new RegistrationService();
        userRepository = new UserRepository();
    }

    public void addNewUser(String login, String password1, String password){
        if (registrationService.signIN(login, password1, password)){
            if (userRepository.getUserByLogin(login) == null){
                User user = new User(login, password);
                userRepository.addNewUser(user);
            }
        }
    }

    public void printAllAboutUsers(){
        for (User user: userRepository.getAllUsers()){
            System.out.println(user.getLogin());
            if (user.getUserBooks() != null){
                for (Book book:user.getUserBooks()){
                    System.out.println(book.getBookName() + ", " + book.getAuthor() + ", " + book.getBookNumber());
                }
            }
        }
    }

    public void deleteUser(String login){
        if (userRepository.getUserByLogin(login) != null){
            userRepository.deleteUser(login);
        }
        else {
            System.out.println("Такого пользователя не существует.");
        }
    }

    public User getUser(String login){
        return userRepository.getUserByLogin(login);
    }

    public void removeBookFromUser(Book book, String login){
        userRepository.getUserBooks(login).remove(book);
    }

    public void addBookToUser(Book book, String login){
        userRepository.getUserBooks(login).add(book);
    }
}
