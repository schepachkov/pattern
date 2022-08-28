package ru.schepachkov.pattern.adapter.model;

import ru.schepachkov.pattern.adapter.model.socket.EuroSocket;

public class EuroRadio {

    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }

}
