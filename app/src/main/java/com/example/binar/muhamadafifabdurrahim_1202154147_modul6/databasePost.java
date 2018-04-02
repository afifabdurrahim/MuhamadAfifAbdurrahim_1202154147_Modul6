package com.example.binar.muhamadafifabdurrahim_1202154147_modul6;

/**
 * Created by telkom on 01/04/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class databasePost {
    String image, judul, caption, user, key;

    public databasePost(){

    }
    public databasePost(String caption, String image, String judul, String user ){
        this.image = image;
        this.judul = judul;
        this.caption = caption;
        this.user = user;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getCaption() {
        return caption;
    }

    public String getUser() {
        return user;
    }

    public String getKey() {
        return key;
    }
}
