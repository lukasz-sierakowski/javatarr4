package com.java.stacktrace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Class3 {
    int value;
    public void send(){
        new Class4(23).send();
    }
}
