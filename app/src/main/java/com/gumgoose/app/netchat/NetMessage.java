package com.gumgoose.app.netchat;

public class NetMessage {

    public NetMessage() {
    }

    private String text;

    private String name;

    private String photoUrl;

    /**
     * Create a new {@link NetMessage} object
     * @param text     is the text of the message
     * @param name     is the sender name of the message
     * @param photoUrl is the image URL of the message
     */
    public NetMessage(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}