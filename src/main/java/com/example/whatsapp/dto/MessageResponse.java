package com.example.whatsapp.dto;

public class MessageResponse {
    private String reply;

    public MessageResponse(String reply) {
        this.reply = reply;
    }

    // Getters and Setters
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
