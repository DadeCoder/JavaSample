package com.dade.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * Created by Dade on 2016/12/2.
 */
@Component
public class MarcoHandler extends AbstractWebSocketHandler {

    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        Thread.sleep(2000);

        System.out.println(message.toString());

        session.sendMessage(new TextMessage("Polo!"));


    }

}
