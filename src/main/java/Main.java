import org.glyme.dao.FacadeManager;
import org.glyme.hibernate.Category;
import org.glyme.hibernate.News;
import org.glyme.hibernate.NewsReview;
import org.glyme.hibernate.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;

/**
 * Created by glyme on 15-5-6.
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/spring-config.xml");
        FacadeManager manager = (FacadeManager) ctx.getBean("manager");

        Category category = new Category();
        category.setName("Efficiency");
        manager.saveCategory(category);

        User user = new User();
        user.setUsername("glyme");
        user.setPassword("jfds");
        manager.saveUser(user);

        News news = new News();
        news.setCategory(category);
        news.setPoster(user);
        news.setContent("test content");
        news.setLastModifyDate(new Date());
        news.setPostDate(new Date());
        news.setTitle("google goes down!");
        manager.saveNews(news);

        NewsReview newsReview = new NewsReview();
        newsReview.setLastModifyDate(new Date());
        newsReview.setContent("test review content");
        newsReview.setPostDate(new Date());
        newsReview.setPoster(user);
        newsReview.setNews(news);
        manager.saveNewsReview(newsReview);
    }
}
