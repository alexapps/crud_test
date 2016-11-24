package org.alexapps.catalogue.dao;

import org.alexapps.catalogue.model.User;

import java.util.List;

/**
 * Created by ladan on 11/9/16.
 */
public interface UserDao {

    /*
      * CREATE and UPDATE
      */
    public void saveUser(User user); // create and update

    /*
     * READ
     */
    public List<User> listUsers();
    public User getUser(int id);

    /*
     * DELETE
     */
    public void deleteUser(int id);
}
