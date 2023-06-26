package com.svshayt.service;

import org.springframework.stereotype.Service;


@Service
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "kafka_demo_topic", groupId = "kafka-consumer")
    public void listener(String message) {
        System.out.println(message);
    }
}
