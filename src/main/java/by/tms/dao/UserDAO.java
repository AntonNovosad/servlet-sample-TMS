package by.tms.dao;

import by.tms.entity.User;

public interface UserDAO {
    void save(User user);
    boolean containsLogin(String login);
    boolean containsLoginAndPassword(String login, String password);
    User getByLogin(String login);
}
