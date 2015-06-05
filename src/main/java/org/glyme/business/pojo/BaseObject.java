package org.glyme.business.pojo;

import java.io.Serializable;

/**
 * Created by glyme on 15-5-6.
 */
public abstract class BaseObject implements Serializable {
    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract int hashCode();
}
