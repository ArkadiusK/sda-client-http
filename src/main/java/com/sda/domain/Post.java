package com.sda.domain;
import java.util.Objects;

public class Post {
    private String userId;
    private String id;

    private String body;

    private String title;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(userId, post.userId) &&
                Objects.equals(id, post.id) &&
                Objects.equals(body, post.body) &&
                Objects.equals(title, post.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, id, body, title);
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId='" + userId + '\'' +
                ", id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
