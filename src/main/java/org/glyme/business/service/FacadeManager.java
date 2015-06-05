package org.glyme.business.service;

import org.glyme.business.pojo.Category;
import org.glyme.business.pojo.News;
import org.glyme.business.pojo.NewsReview;
import org.glyme.business.pojo.User;
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
