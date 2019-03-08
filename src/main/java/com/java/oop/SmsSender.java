package com.java.oop;

public class SmsSender extends MessageSender {
    @Override
    public boolean sendMessage(Message message) {
        System.out.println("Wysłanie message za pomocą SMS-a");
        return false;
    }

    @Override
    public void introduce() {
        System.out.println("Jestem SmsSender");
    }
}
