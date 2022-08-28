package ru.schepachkov.pattern.adapter.model.socket.impl;

import ru.schepachkov.pattern.adapter.model.socket.AmericanSocket;

public class SimpleAmericanSocket implements AmericanSocket {


    public void getPower() {
        System.out.println("Get american socket power!");
    }
}
