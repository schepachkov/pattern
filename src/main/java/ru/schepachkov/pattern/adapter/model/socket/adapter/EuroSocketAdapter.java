package ru.schepachkov.pattern.adapter.model.socket.adapter;

import ru.schepachkov.pattern.adapter.model.socket.AmericanSocket;
import ru.schepachkov.pattern.adapter.model.socket.EuroSocket;

public class EuroSocketAdapter implements EuroSocket {

    private AmericanSocket americanSocket;

    public EuroSocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public void getPower() {
        americanSocket.getPower();
    }
}
