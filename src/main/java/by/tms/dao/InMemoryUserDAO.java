package by.tms.dao;

import by.tms.entity.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDAO implements UserDAO {
    private static List<User> users = new ArrayList<>();
    private static int id = 0;

    @Override
    public void save(User user) {
        user.setId(id++);
        users.add(user);
    }

    @Override
    public boolean containsLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsLoginAndPassword(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User getByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
