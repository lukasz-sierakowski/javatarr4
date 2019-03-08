package com.java.stacktrace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Class1 {
    int value;

    public void send(){
        new Class2(23423).send();
    }
}
