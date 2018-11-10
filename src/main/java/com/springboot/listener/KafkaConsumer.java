package com.springboot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.service.UserService;

@Service
public class KafkaConsumer {
	public static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	UserService userService;

	//    @KafkaListener(topics = "Kafka_Example", group = "group_id")
	//    public void consume(String message) {
	//        System.out.println("Consumed message: " + message);
	//    }


	@KafkaListener(topics = "Kafka_Example_json", group = "group_json",
			containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
		userService.saveUser(user);

	}
}
