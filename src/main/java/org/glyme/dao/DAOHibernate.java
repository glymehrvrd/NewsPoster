package org.glyme.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by glyme on 15-5-7.
 */
public class DAOHibernate implements DAO {
    private SessionFactory sessionFactory;

    @Override
    public List getObjects(Class clazz) {
        return getCurrentSession().createCriteria(clazz).list();
    }

    @Override
    public Object getObject(Class clazz, Serializable id) {
        return getCurrentSession().get(clazz, id);
    }

    @Override
    public void saveObject(Object o) {
        getCurrentSession().save(o);
    }

    @Override
    public void deleteObject(Class clazz, Serializable id) {
        getCurrentSession().delete(clazz);
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
