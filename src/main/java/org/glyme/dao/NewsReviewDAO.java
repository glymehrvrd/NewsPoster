package org.glyme.dao;

import org.glyme.hibernate.NewsReview;

/**
 * Created by glyme on 15-5-7.
 */
public interface NewsReviewDAO extends DAO {
    public NewsReview getNewsReview(Long newsReviewId);

    public void saveNewsReview(NewsReview newsReview);

    public void deleteNewsReview(NewsReview newsReview);
}
