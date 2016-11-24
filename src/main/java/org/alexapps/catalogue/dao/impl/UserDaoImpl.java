package org.alexapps.catalogue.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.alexapps.catalogue.model.User;
import org.alexapps.catalogue.dao.UserDao;

import java.util.List;
import java.util.logging.Logger;


/**
 * Created by ladan on 11/9/16.
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private Logger  logger = Logger.getLogger("UserDaoImpl");

    private Session getSession() {
        Session sess = getSessionFactory().getCurrentSession();
        if (sess == null) {
            sess = getSessionFactory().openSession();
            logger.info("session created");
        }

        return sess;
    }

    private SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public void saveUser(User user) {
        getSession().merge(user);
    }

    public List<User> listUsers() {

        logger.info("listUsers() " + getSession().createCriteria(User.class).list());
        return getSession().createCriteria(User.class).list();
    }

    public User getUser(int id) {
        return (User)getSession().get(User.class, id);
    }

    public void deleteUser(int id) {
        User user = getUser(id);

        if (null != user) {
            getSession().delete(user);
            logger.info("user deleted");
        }

    }
}
