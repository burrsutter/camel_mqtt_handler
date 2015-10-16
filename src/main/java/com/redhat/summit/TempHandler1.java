package com.redhat.summit;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Message;

public class TempHandler1 {


    @Handler
    public void process(final Exchange exchange) {
        final Message message = exchange.getIn();
        final String text = message.getBody(String.class);
        System.out.println("Received: " + text);
    }

}