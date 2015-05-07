package org.glyme.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by glyme on 15-5-7.
 */
public interface DAO {
    public List getObjects(Class clazz);

    public Object getObject(Class clazz, Serializable id);

    public void saveObject(Object o);

    public void deleteObject(Class clazz, Serializable id);
}
