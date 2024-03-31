package testing.library;

import testing.library.model.Book;
import testing.library.model.User;
import testing.library.service.BookService;
import testing.library.service.UserService;

import java.util.List;

public class Library {
    private UserService userService;
    private BookService bookService;

    public Library() {
        userService = new UserService();
        bookService = new BookService();
    }

    public void addNewUser(String login, String password1, String password2){
        userService.addNewUser(login, password1, password2);
    }

    public void printAllUsers() {
        userService.printAllAboutUsers();
    }

    public void deleteUser(String login){
        userService.deleteUser(login);
    }

    public void printAllBooks(){
        bookService.printAllBooks();
    }

    public void addNewBook(String bookName, String author){
        bookService.addNewBook(bookName, author);
    }

    public void deleteBook(Integer bookNumber){
        bookService.deleteBook(bookNumber);
    }

    public List<Integer> findBook(String bookName, String author){
        return bookService.findBook(bookName, author);
    }

    public void findBookByBookName(String bookName){
        bookService.findBookByBookName(bookName);
    }

    public void printAllAboutBooks(){
        bookService.printAllAboutBooks();
    }

    public void addBookToUser(String login, Integer bookNumber){
        Book book = bookService.getBook(bookNumber);
        User user = userService.getUser(login);
        if ((book != null)&&(user != null)){
            userService.addBookToUser(book, login);
            book.setUser(user);
        }
        else {
            System.out.println("ОШИБКА!");
        }
    }

    public void removeBookFromUser(String login, Integer bookNumber){
        Book book = bookService.getBook(bookNumber);
        User user = userService.getUser(login);
        if ((book != null)&&(user != null)){
            userService.removeBookFromUser(book, login);
            book.setUser(null);
        }
        else {
            System.out.println("ОШИБКА!");
        }
    }
}
