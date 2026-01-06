package com.java.adm.socket_cfg;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // Aquí llega lo que envíe el HTML
        String payload = message.getPayload();
        System.out.println("Mensaje recibido: " + payload);

        // (Opcional) Responderle al cliente
        try {
            session.sendMessage(new TextMessage("Recibido: " + payload));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}