package org.alexapps.catalogue.service;


import org.alexapps.catalogue.model.User;

import java.util.List;

public interface UserService {


    public List<User> listUsers();
    public User getUser(int id);
    public void deleteUser(int id);
    public void saveUser(User user);
}