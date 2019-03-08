package com.java.oop;

public class EmailSender extends MessageSender {
    @Override
    public boolean sendMessage(Message message) {
        System.out.println("Wysłanie message za pomocą E-maila");
        return true;
    }

    @Override
    public Message prepareMessage(String recipient, String message) {
        return new Message(recipient, message);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem EmailSender");
    }
}
