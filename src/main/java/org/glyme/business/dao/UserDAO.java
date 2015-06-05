package org.glyme.business.dao;

import org.glyme.business.pojo.User;

/**
 * Created by glyme on 15-5-7.
 */
public interface UserDAO extends DAO{
    public User getUser(String username);

    public void saveUser(User user);

    public void deleteUser(User user);
}
