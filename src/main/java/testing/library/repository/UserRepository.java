package testing.library.repository;

import testing.library.model.Book;
import testing.library.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<String, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public User getUserByLogin(String login){
        return users.get(login);
    }
    public void addNewUser(User user){
        users.put(user.getLogin(), user);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public void deleteUser(String login){
        users.remove(login);
    }

    public ArrayList<Book> getUserBooks(String login){
        User user = getUserByLogin(login);
        return user.getUserBooks();
    }
}
