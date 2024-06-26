package com.example.demo.DAO;


import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User getUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
