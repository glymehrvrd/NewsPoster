package org.glyme.hibernate;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
import java.util.Set;

/**
 * Created by glyme on 15-5-6.
 * @hibernate.class table="news"
 * @structs.form include-all="false" extends="BaseForm"
 */
public class News extends BaseObject {
    private Set newsReviews;
    private Category category;
    private Date lastModifyDate;
    private Date postDate;
    private User poster;
    private String content;
    private Long id;
    private String title;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("title", title)
                .append("postDate", postDate).append("content", content)
                .append("lastModifyDate", lastModifyDate).append("category", category)
                .append("newsReviews", newsReviews).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof News)) {
            return false;
        }
        News rhs = (News) o;
        return poster.equals(rhs.getPoster())
                && postDate.equals(rhs.getPostDate());
    }

    @Override
    public int hashCode() {
        return poster.hashCode() + postDate.hashCode();
    }

    public Set getNewsReviews() {
        return newsReviews;
    }

    public void setNewsReviews(Set newsReviews) {
        this.newsReviews = newsReviews;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
