package com.learn.kafka.demo.service

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducerService(val kafkaTemplate: KafkaTemplate<Any, Any>) {

    var kafkaTopic = "quickstart-events"

    fun send(message: String) {
        kafkaTemplate.send(kafkaTopic, message)
    }

}
