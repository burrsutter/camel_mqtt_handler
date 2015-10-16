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
		// System.out.println("What is it: " + message.getBody().getClass().getCanonicalName());
		final TempPojo sensorReading = message.getBody(TempPojo.class);
		if (sensorReading != null) {
			System.out.println("TEMP: " + sensorReading.getTemp());
			if (sensorReading.getTemp() > 22.0) {
				System.out.println("\nHOT\n");
			}
		} else {
			System.out.println("temp is null");
		}
    }

}