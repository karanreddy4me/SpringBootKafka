package com.springboot.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.springboot.model.User;
import com.springboot.util.CustomErrorType;



@RestController
@RequestMapping("/api")
public class RestApiController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

//	private static final String TOPIC = "Kafka_Example";
	private static final String TOPIC = "Kafka_Example_json";
	@RequestMapping("/click/{name}")
	public String welcome(@PathVariable("name") final String name) {//Welcome page, non-rest
		logger.info("rest endpoint /click");
		kafkaTemplate.send(TOPIC, new User(name, new Integer(1)));

		return "Published successfully";
		//return "Welcome to Rest Example.";
	}
}
