package org.glyme.hibernate;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by glyme on 15-5-6.
 */
public class User extends BaseObject {
    private String password;
    private String username;

    public User() {
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("username",username)
                .append("password",password)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User)) {
            return false;
        }
        User rhs = (User) o;
        return username.equals(rhs.getUsername());
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
