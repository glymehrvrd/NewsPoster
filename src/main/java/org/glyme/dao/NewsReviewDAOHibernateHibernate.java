package org.glyme.dao;

import org.glyme.hibernate.NewsReview;

/**
 * Created by glyme on 15-5-7.
 */
public class NewsReviewDAOHibernateHibernate extends DAOHibernate implements NewsReviewDAO {
    @Override
    public NewsReview getNewsReview(Long newsReviewId) {
        return (NewsReview) getCurrentSession().get(NewsReview.class, newsReviewId);
    }

    @Override
    public void saveNewsReview(NewsReview newsReview) {
        getCurrentSession().save(newsReview);
    }

    @Override
    public void deleteNewsReview(NewsReview newsReview) {
        getCurrentSession().delete(newsReview);
    }
}
