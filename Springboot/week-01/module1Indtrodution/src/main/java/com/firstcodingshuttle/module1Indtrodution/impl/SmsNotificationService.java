package com.firstcodingshuttle.module1Indtrodution.impl;

import com.firstcodingshuttle.module1Indtrodution.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// if ther are 2 componte in the class we use the primary to tell the compiler that it is the first or main oine
@Primary
@Component
@ConditionalOnProperty(name = "notification.type ", havingValue = "sms")

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms sending......"+message);
    }
}
