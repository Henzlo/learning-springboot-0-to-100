package com.firstcodingshuttle.module1Indtrodution;

import com.firstcodingshuttle.module1Indtrodution.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IndtrodutionApplication implements CommandLineRunner {
	// @Autowird is used for the injected fo the method
//	@Autowired
//	PaymentService paymentServiceObj;
//	//
//	 for most of the case we dont use Autowired beacuse it can not be mutable
	//so we use the constructor for it


//@Autowired
	// by usning the constructor they doesnot modified ,willingly and not willingly
	final NotificationService notificationServiceObj;


	public static void main(String[] args) {

		SpringApplication.run(Module1IndtrodutionApplication.class, args);
	}
	// cosntruction crated
	public Module1IndtrodutionApplication(NotificationService notificationServiceObj) {
		this.notificationServiceObj = notificationServiceObj;
	}

	// it is the spring boot online

	public void run(String... args) throws Exception {
		// old java object creation
//		NotificationService notificationServiceObj = new EmailNotificationService();
		notificationServiceObj.send("Hello");

	}
}
