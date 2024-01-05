package com.sujit.KafkaMessageProducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sujit.KafkaMessageProducer.dto.PaymentProcessing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaMessageConsumerApplication {
	Logger log= LoggerFactory.getLogger(KafkaMessageConsumerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(KafkaMessageConsumerApplication.class, args);
	}

	@KafkaListener(topics = "test",groupId = "messanger")
	public void consumeMessage1(PaymentProcessing processing){
        try {
            log.info("KafkaMessageConsumerApplication :: consumeMessage-1 consuming message {}",new ObjectMapper().writeValueAsString(processing));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
