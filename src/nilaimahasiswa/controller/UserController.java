package nilaimahasiswa.controller;

import nilaimahasiswa.dao.UserDAO;
import nilaimahasiswa.model.User;

/**
 * Logika login.
 *
 * @author Ubai
 */
public class UserController {
    private final UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        return userDAO.login(username, password);
    }
}
