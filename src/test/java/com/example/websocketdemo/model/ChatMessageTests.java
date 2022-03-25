package com.example.websocketdemo.model;

import org.junit.Assert;
import org.junit.Test;

public class ChatMessageTests {

    @Test
    public void typeShouldBeChat() {
        ChatMessage message = getChatMessageObject(ChatMessage.MessageType.CHAT, "#FFFF", "a.murillo", "Coucou !");

        Assert.assertEquals(ChatMessage.MessageType.CHAT, message.getType());
    }

    @Test
    public void senderShouldBeWhite() {
        ChatMessage message = getChatMessageObject(ChatMessage.MessageType.JOIN, "#FFFF", "a.murillo", "Prout !");

        Assert.assertEquals("#FFFF", message.getSenderColor());
    }

    @Test
    public void senderShouldBeBeautiful() {
        ChatMessage message = getChatMessageObject(ChatMessage.MessageType.JOIN, "#00000", "a.murillo", "Pouet !");

        Assert.assertEquals("a.murillo", message.getSender());
    }

    @Test
    public void messageShouldBeInteresting() {
        ChatMessage message = getChatMessageObject(ChatMessage.MessageType.JOIN, "#00000", "x.avellan", "Coucou !");

        Assert.assertEquals("Coucou !", message.getContent());
    }


    private ChatMessage getChatMessageObject(ChatMessage.MessageType type, String color, String sender, String content) {
        ChatMessage result = new ChatMessage();
        result.setType(type);
        result.setSenderColor(color);
        result.setSender(sender);
        result.setContent(content);
        return result;
    }

}
