package org.glyme.business.dao;

import org.glyme.business.pojo.Category;

/**
 * Created by glyme on 15-5-7.
 */
public class CategoryDAOHibernateHibernate extends DAOHibernate implements CategoryDAO {
    @Override
    public Category getCategory(Long categoryId) {
        return (Category) getCurrentSession().get(Category.class, categoryId);
    }

    @Override
    public void saveCategory(Category category) {
        getCurrentSession().save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        getCurrentSession().delete(category);
    }
}
