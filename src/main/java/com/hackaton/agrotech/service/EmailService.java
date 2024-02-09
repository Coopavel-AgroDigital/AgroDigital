package com.hackaton.agrotech.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public static final String ACCOUNT_SID = "ACc2a4fc48fea3b641d9bb421f125d66d5";
    public static final String AUTH_TOKEN = "18c1116b29b9c6600c21e5809ce54201";

    public void sendMessage(String message) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+554591558558"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                message).create();

        System.out.println("Hello");
    }

}
