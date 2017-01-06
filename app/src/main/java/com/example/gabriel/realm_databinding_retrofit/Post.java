package com.example.gabriel.realm_databinding_retrofit;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by gabriel on 06/01/2017.
 */

public class Post extends RealmObject {
    @PrimaryKey
    private int id;
    private int userId;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
