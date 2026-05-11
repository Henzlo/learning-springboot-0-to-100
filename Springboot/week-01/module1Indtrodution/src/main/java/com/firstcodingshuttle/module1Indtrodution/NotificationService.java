package com.firstcodingshuttle.module1Indtrodution;
// @Component is use in the class not the interface so we use this in the Emailnotification
public interface NotificationService {
//     there could be multiple or instance of sending notification
    void send(String message);

}
