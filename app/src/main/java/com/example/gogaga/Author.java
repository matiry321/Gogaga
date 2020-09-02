package com.example.gogaga;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

public class Author {


        @SerializedName("name")
        private String name;
        @SerializedName("imageurl")
        private String imageurl;

        public Author(String name, String imageurl) {
            this.name = name;
            this.imageurl = imageurl;
        }

        public String getName() {
            return name;
        }

        public String getImageurl() {
            return imageurl;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}

