package org.glyme.business.dao;

import org.glyme.business.pojo.News;

/**
 * Created by glyme on 15-5-7.
 */
public class NewsDAOHibernateHibernate extends DAOHibernate implements NewsDAO {
    @Override
    public News getNews(Long newsId) {
        return (News) getCurrentSession().get(News.class, newsId);
    }

    @Override
    public void saveNews(News news) {
        getCurrentSession().save(news);
    }

    @Override
    public void deleteNews(News news) {
        getCurrentSession().delete(news);
    }
}
