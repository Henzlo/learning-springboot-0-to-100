package com.firstcodingshuttle.module1Indtrodution.impl;

import com.firstcodingshuttle.module1Indtrodution.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
// @Qualifier is also the same thing as the compoenet but here we need to give the parmater with it
//@Qualifier("Emailnotif")
// so that why we have use the conditional statement and based on the resources which is insuide the resources file --> application properties

 @ConditionalOnProperty(name = "notification.type ", havingValue = "email") 

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sending......"+message);
    }
}
