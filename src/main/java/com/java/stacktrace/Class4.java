package com.java.stacktrace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Class4 {
    int value;
    public void send(){
        new Class5(11).send();
    }
}
