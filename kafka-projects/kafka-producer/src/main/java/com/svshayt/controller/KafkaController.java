package com.svshayt.controller;

import com.svshayt.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    public KafkaSender kafkaSender;

    @GetMapping()
    public void send() {
        kafkaSender.sendMessage("QQ", "kafka_demo_topic");
    }
}
