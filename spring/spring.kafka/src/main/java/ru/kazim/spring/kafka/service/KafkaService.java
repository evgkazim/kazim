package ru.kazim.spring.kafka.service;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class KafkaService {
    private int count = 0;
    private int part = 0;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 300)
    public void send() {
        kafkaTemplate.send("kafka.test", part++, "key", ("test"+ (count++)));
        if (part == 3)
            part = 0;
    }

//    @KafkaListener(topics = "kafka.test")
//    public void listener(ConsumerRecord<String, String> record) {
//        System.out.println(record.toString());
//    }
}
