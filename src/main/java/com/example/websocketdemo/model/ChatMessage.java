package com.example.websocketdemo.model;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
    private String senderColor;
    private String attachement;
    private String attachementFileName;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderColor() {
        return senderColor;
    }

    public void setSenderColor(String senderColor) {
        this.senderColor = senderColor;
    }

    public String getAttachement() { return attachement;}

    public void setAttachement(String attachement) { this.attachement = attachement; }

    public String getAttachementFileName() { return attachementFileName; }

    public void setAttachementFileName(String attachementFileName) { this.attachementFileName = attachementFileName; }
}
