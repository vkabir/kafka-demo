package com.learn.kafka.demo.controller

import com.learn.kafka.demo.service.KafkaConsumerService
import com.learn.kafka.demo.service.KafkaProducerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka/")
class KafkaController(val kafkaProducerService: KafkaProducerService, val kafkaConsumerService: KafkaConsumerService) {

    @GetMapping(value = ["/producer"])
    fun sendMessage(@RequestParam("message") message: String): String {
        println("Before sending message")
        kafkaProducerService.send(message)
        return "Message sent Successfully to the Kafka topic quickstart-events topic"
    }


}