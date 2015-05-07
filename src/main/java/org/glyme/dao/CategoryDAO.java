package org.glyme.dao;

import org.glyme.hibernate.Category;

/**
 * Created by glyme on 15-5-7.
 */
public interface CategoryDAO extends DAO{
    public Category getCategory(Long categoryId);

    public void saveCategory(Category category);

    public void deleteCategory(Category category);
}
