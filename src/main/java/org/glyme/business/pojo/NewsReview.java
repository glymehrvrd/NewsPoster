package org.glyme.business.pojo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * Created by glyme on 15-5-6.
 */
public class NewsReview extends BaseObject {
    private String content;
    private Long id;
    private Date lastModifyDate;
    private News news;
    private Date postDate;
    private User poster;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("content", content)
                .append("lastModifyDate", lastModifyDate)
                .append("news", news)
                .append("postDate", postDate)
                .append("poster", poster)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NewsReview)) {
            return false;
        }
        NewsReview rhs = (NewsReview) o;
        return postDate.equals(rhs.getPostDate())
                && poster.equals(rhs.getPoster());
    }

    @Override
    public int hashCode() {
        return postDate.hashCode()
                + poster.hashCode();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }
}
