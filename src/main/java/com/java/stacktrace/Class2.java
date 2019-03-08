package com.java.stacktrace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Class2 {
    int value;
    public void send(){
        new Class3(432).send();
    }
}
