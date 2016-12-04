package com.dade.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Dade on 2016/12/3.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    MarcoHandler marcoHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //webSocketHandlerRegistry.addHandler(marcoHandler,"/marco").setAllowedOrigins("*").withSockJS();
        webSocketHandlerRegistry.addHandler(marcoHandler,"/marco").setAllowedOrigins("http://localhost:63342").withSockJS();
    }

    /**
     * 刚开始一直纠结于403从那来的，后来点开源码才发现，spring默认会给一个OriginHandshakeInterceptor的拦截器，这就比较坑了，好歹文档写一下啊，或者有地方配置一下（也有可能楼主好久没用spring，这个拦截器在之前的版本中说明了），总之找到问题就好解决了

     registry.addHandler(webSokcetHandler(), "/websocket").addInterceptors(new HandshakeInterceptor()).setAllowedOrigins("http://localhost");

     在注册handler的时候加一句setAllowedOrigins就搞定了。
     * http://www.linuxidc.com/Linux/2015-03/114752.htm
     *
     *
     *
     * Doesn't it impair the security, allowing cross-site request forgery? – user2417480 Jun 13 at 7:59

     @user2417480, you are absolutely right, but it can be protected by having a XSRF token or some sort. – Harry Cho Sep 2 at 18:12
     */

}
