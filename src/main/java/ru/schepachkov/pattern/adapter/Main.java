package ru.schepachkov.pattern.adapter;

import ru.schepachkov.pattern.adapter.model.EuroRadio;
import ru.schepachkov.pattern.adapter.model.socket.adapter.EuroSocketAdapter;
import ru.schepachkov.pattern.adapter.model.socket.impl.SimpleAmericanSocket;

public class Main {

    public static void main(String[] args) {
        EuroRadio euroRadio = new EuroRadio();
        EuroSocketAdapter euroSocketAdapter = new EuroSocketAdapter(new SimpleAmericanSocket());
        euroRadio.listenMusic(euroSocketAdapter);
    }
}
