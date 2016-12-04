package com.dade.stomp;

import org.jboss.logging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

/**
 * Created by Dade on 2016/12/4.
 */
@Controller
public class MarcoController {

    @MessageMapping("/marco")
    public void handleShout(Shout incoming){
        System.out.println(incoming.getMessage());
    }

    @SubscribeMapping("/marco")
    public Shout handleSubscript(){
        Shout outgoing = new Shout();
        outgoing.setMessage("Polo!");
        System.out.println("sub");
        return outgoing;
    }

}
