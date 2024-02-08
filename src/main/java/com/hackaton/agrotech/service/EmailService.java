package com.hackaton.agrotech.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendMessage(String message) {
        Twilio.init("ACc2a4fc48fea3b641d9bb421f125d66d5", "176931b6324880b5e17c14fb1535e126");
        Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:+554591558558"),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        message)
                .create();
        System.out.printf("Ok" +
                "");
    }

}
