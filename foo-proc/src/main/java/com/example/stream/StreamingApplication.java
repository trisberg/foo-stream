package com.example.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stream.functions.FooProcessor;

@SpringBootApplication
public class StreamingApplication {

	private static String VALUE = "0";
	static Logger logger = LoggerFactory.getLogger(FooProcessor.class);

	public static void main(String[] args) {
		String envTestValue = System.getenv("TEST_VALUE");
		if (envTestValue != null) {
			VALUE = envTestValue;
		}
		logger.info("!!! The test.value is: {}",  VALUE);
		if (VALUE != null && VALUE.equals("X")) {
			throw new RuntimeException("Ouch!!!");
		} else {
			SpringApplication.run(StreamingApplication.class, args);
		}
	}
}
