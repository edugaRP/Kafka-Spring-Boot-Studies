package com.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sales" , groupId = "groupId")
    void listener(String data){
        System.out.println("Listener Received: " + data + " :)");
    }
}
