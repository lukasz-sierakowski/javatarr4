package com.java.stacktrace;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Class5 {
    int value;
    public void send(){
        System.out.println("Class5");
        throw new RuntimeException("Wystąpił błąd w Class5");
    }
}
