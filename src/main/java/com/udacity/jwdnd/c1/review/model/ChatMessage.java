package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    private String username;
    private String messagetext;
    private String messageid;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return messagetext;
    }

    public void setMessage(String message) {
        this.messagetext = message;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }
}
