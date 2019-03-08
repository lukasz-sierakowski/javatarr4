package com.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("recipient", "message");
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();
        BaseClass smsSender1 = new SmsSender();
        // smsSender1.sendMessage(); To jest niepoprawne
        //((MessageSender) smsSender1).sendMessage(message);

        emailSender.sendMessage(message);
        smsSender.sendMessage(message);

        EmailSender emailSender2 = new EmailSender();
        emailSender2.introduce();
        MessageSender messageSender2 = new EmailSender();
        messageSender2.introduce();

        List<MessageSender> list = new ArrayList<>();
        list.add(new EmailSender());
        list.add(new SmsSender());
        list.forEach(sender -> sender.sendMessage(new Message()));
        Person person = new Person();
        person.getAddress().getStreet();
    }
}
