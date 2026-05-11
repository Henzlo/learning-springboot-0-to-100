package com.firstcodingshuttle.module1Indtrodution;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

// @compunt is used for the function call
@Component
// the control fo creating and managing the bean of call is hadle by java spring boot like object crate
//@RestController -->
//@Service  --> business logic
//@Repository --> database access
//@Controller  --> web layer
// @Component --> geniric beam

public class PaymentService {
//    call a  fuction for it to call it
    public void pay(){
        System.out.println("paying....");
    }
@PostConstruct
    // Bean life cycle --> post construct
     public void afterInit(){
        System.out.println("Before paying ..");
     }
     @PreDestroy
     public void beforeDestroy(){
        System.out.println("After payment is done");
     }
}
