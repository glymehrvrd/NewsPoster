import org.glyme.business.pojo.Category;
import org.glyme.business.pojo.News;
import org.glyme.business.pojo.NewsReview;
import org.glyme.business.pojo.User;
import org.glyme.business.service.FacadeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by glyme on 15-5-6.
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
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
