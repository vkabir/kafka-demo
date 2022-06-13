package com.learn.kafka.demo.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumerService {

    @KafkaListener(topics = ["quickstart-events"])
    fun listen(message: String) {
        println("Received Message : $message")
    }
}