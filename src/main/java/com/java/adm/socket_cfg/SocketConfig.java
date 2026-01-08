package com.java.adm.socket_cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

//@Configuration
//@EnableWebSocket  LOS SOCKETS TEMPORALMENTE NO LOS USO, SI A FUTURO REQUIERO TIEMPO REAL LOS RETOMO
public class SocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // Define la URL: ws://localhost:8080/mi-socket
        registry.addHandler(new SocketHandler(), "/sala")
                .setAllowedOrigins("*"); // Permite conexión desde cualquier lado
    }
}