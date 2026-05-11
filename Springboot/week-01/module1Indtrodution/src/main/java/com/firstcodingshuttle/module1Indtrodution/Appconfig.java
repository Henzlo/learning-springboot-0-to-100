package com.firstcodingshuttle.module1Indtrodution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean // best wy to create abeam
    PaymentService paymentService(){
        return new PaymentService();
    }
}
