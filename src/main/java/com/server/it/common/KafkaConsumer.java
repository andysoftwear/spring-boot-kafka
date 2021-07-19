package com.server.it.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "xiaoha", groupId = "group_id")
    public void consume(String message) {
        log.info("## consume message: {}", message);
    }
}
