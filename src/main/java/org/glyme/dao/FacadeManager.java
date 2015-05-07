package org.glyme.dao;

import org.glyme.hibernate.Category;
import org.glyme.hibernate.News;
import org.glyme.hibernate.NewsReview;
import org.glyme.hibernate.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by glyme on 15-5-7.
 */
public interface FacadeManager {
    @Transactional
    public void saveCategory(Category category);

    @Transactional
    public void deleteCategory(Long id);

    @Transactional
    public List getCategories();

    @Transactional
    public News getNews(Long id);

    @Transactional
    public void saveNews(News news);

    @Transactional
    public void deleteNews(Long id);

    @Transactional
    public NewsReview getNewsReview(Long id);

    @Transactional
    public void saveNewsReview(NewsReview newsReview);

    @Transactional
    public void deleteNewsReview(Long id);

    @Transactional
    public User getUser(String username);

    @Transactional
    public List getUsers();

    @Transactional
    public void saveUser(User user);

    @Transactional
    public void deleteUser(String username);

    @Transactional
    public boolean validateUser(User user);
}
