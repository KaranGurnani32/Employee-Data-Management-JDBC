package javabean;

import java.io.Serializable;

public class Book implements Serializable {
    //Java bean is a class which contain state and no arg constructor and getter and setter method
    String authorName;
    String title;
    boolean isPublished;

    public Book() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}
