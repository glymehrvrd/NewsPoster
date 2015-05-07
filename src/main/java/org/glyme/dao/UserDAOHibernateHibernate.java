package org.glyme.dao;

import org.glyme.hibernate.User;

/**
 * Created by glyme on 15-5-7.
 */
public class UserDAOHibernateHibernate extends DAOHibernate implements UserDAO {
    @Override
    public User getUser(String username) {
        return (User) getCurrentSession().get(User.class, username);
    }

    @Override
    public void saveUser(User user) {
        getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public void deleteUser(User user) {
        getCurrentSession().delete(user);
    }
}
