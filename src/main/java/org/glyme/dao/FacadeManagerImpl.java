package org.glyme.dao;

import org.glyme.hibernate.Category;
import org.glyme.hibernate.News;
import org.glyme.hibernate.NewsReview;
import org.glyme.hibernate.User;

import java.util.List;

/**
 * Created by glyme on 15-5-7.
 */
public class FacadeManagerImpl implements FacadeManager {
    private CategoryDAO categoryDAO;
    private NewsDAO newsDAO;
    private NewsReviewDAO newsReviewDAO;
    private UserDAO userDAO;

    public FacadeManagerImpl() {
    }

    @Override
    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryDAO.deleteCategory(categoryDAO.getCategory(id));
    }

    @Override
    public List getCategories() {
        return categoryDAO.getObjects(Category.class);
    }

    @Override
    public News getNews(Long id) {
        return newsDAO.getNews(id);
    }

    @Override
    public void saveNews(News news) {
        newsDAO.saveNews(news);
    }

    @Override
    public void deleteNews(Long id) {
        newsDAO.deleteNews(newsDAO.getNews(id));
    }

    @Override
    public NewsReview getNewsReview(Long id) {
        return newsReviewDAO.getNewsReview(id);
    }

    @Override
    public void saveNewsReview(NewsReview newsReview) {
        newsReviewDAO.saveNewsReview(newsReview);
    }

    @Override
    public void deleteNewsReview(Long id) {
        newsReviewDAO.deleteNewsReview(newsReviewDAO.getNewsReview(id));
    }

    @Override
    public User getUser(String username) {
        return userDAO.getUser(username);
    }

    @Override
    public List getUsers() {
        return userDAO.getObjects(User.class);
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void deleteUser(String username) {
        userDAO.deleteUser(userDAO.getUser(username));
    }

    @Override
    public boolean validateUser(User user) {
        User userInDB = getUser(user.getUsername());
        return userInDB != null
                && userInDB.getPassword().equals(user.getPassword());
    }

    public CategoryDAO getCategoryDAO() {
        return categoryDAO;
    }

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public NewsDAO getNewsDAO() {
        return newsDAO;
    }

    public void setNewsDAO(NewsDAO newsDAO) {
        this.newsDAO = newsDAO;
    }

    public NewsReviewDAO getNewsReviewDAO() {
        return newsReviewDAO;
    }

    public void setNewsReviewDAO(NewsReviewDAO newsReviewDAO) {
        this.newsReviewDAO = newsReviewDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
