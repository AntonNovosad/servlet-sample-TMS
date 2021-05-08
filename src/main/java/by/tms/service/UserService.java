package by.tms.service;

import by.tms.dao.InMemoryUserDAO;
import by.tms.entity.User;

public class UserService {
    InMemoryUserDAO inMemoryUserDAO = new InMemoryUserDAO();

    public boolean add(User user) {
        if (inMemoryUserDAO.containsLogin(user.getLogin())) {
            return false;
        } else {
            inMemoryUserDAO.save(user);
            return true;
        }
    }

    public User getByLogin(String login) {
        if (inMemoryUserDAO.containsLogin(login)) {
            return inMemoryUserDAO.getByLogin(login);
        }
        return null;
    }
}
