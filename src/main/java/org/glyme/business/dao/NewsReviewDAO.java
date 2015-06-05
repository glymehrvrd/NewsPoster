package org.glyme.business.dao;

import org.glyme.business.pojo.NewsReview;

/**
 * Created by glyme on 15-5-7.
 */
public interface NewsReviewDAO extends DAO {
    public NewsReview getNewsReview(Long newsReviewId);

    public void saveNewsReview(NewsReview newsReview);

    public void deleteNewsReview(NewsReview newsReview);
}
