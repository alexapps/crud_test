package org.alexapps.catalogue.service.impl;

import org.alexapps.catalogue.dao.UserDao;
import org.alexapps.catalogue.model.User;
import org.alexapps.catalogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by ladan on 11/10/16.
 */


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional( readOnly = true)
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional( readOnly = true)
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }


}
