package org.glyme.hibernate;

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
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
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
