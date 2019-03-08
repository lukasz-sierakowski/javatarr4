package com.java.oop;

public abstract class MessageSender extends BaseClass {

    public abstract boolean sendMessage(Message message);

    public Message prepareMessage(String recipient, String message) {
        return new Message(recipient, message);
    }

    public void introduce() {
        System.out.println("Jestem MessageSender");
    }
}
