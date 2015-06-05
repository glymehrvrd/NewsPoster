package org.glyme.business.dao;

import org.glyme.business.pojo.Category;

/**
 * Created by glyme on 15-5-7.
 */
public interface CategoryDAO extends DAO{
    public Category getCategory(Long categoryId);

    public void saveCategory(Category category);

    public void deleteCategory(Category category);
}
