package com.springboot.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping("/click")
    public String welcome() {//Welcome page, non-rest
		logger.info("rest endpoint /click");
		
		return "Welcome to Rest Example.";
    }
}
