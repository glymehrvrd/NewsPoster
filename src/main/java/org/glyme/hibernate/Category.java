package org.glyme.hibernate;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Set;

/**
 * Created by glyme on 15-5-6.
 */
public class Category extends BaseObject {
    private Long id;
    private String name;
    private Set news;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("news", news)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Category)) {
            return false;
        }
        Category rhs = (Category) o;
        return name.equals(rhs.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getNews() {
        return news;
    }

    public void setNews(Set news) {
        this.news = news;
    }
}
