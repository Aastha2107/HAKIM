package com.aasthajain.hakim;

public class Chat {
    String imageURL,name;

    public Chat(String imageURL, String name) {
        this.imageURL = imageURL;
        this.name = name;
    }

    public Chat() {
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
