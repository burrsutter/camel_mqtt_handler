package com.redhat.summit;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Message;

import java.util.HashMap;
import java.util.Map;

public class TempHandler {
    @Handler
    public void process(final Exchange exchange) {
        final Message message = exchange.getIn();
		System.out.println("What is it: " + message.getBody().getClass().getCanonicalName());
        // final String text = message.getBody(String.class);
		final TempPojo temp = message.getBody(TempPojo.class);
		if (temp != null) {
			System.out.println(temp.getTemp());
		}
    }

}