package testing.library.model;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private ArrayList<Book> userBooks;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.userBooks = new ArrayList<>();
    }


    public boolean equals(User user) {
        return this.login.equals(user.login);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void addBookToUser(Book book){
        userBooks.add(book);
    }



    public ArrayList<Book> getUserBooks(){
        return userBooks;
    }
}
