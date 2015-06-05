package org.glyme.business.dao;

import org.glyme.business.pojo.News;

/**
 * Created by glyme on 15-5-7.
 */
public interface NewsDAO extends DAO {
    public News getNews(Long newsId);

    public void saveNews(News news);

    public void deleteNews(News news);
}
