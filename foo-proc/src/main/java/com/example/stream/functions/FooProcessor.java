package com.example.stream.functions;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

import com.example.stream.model.Foo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class FooProcessor 
{

	Logger logger = LoggerFactory.getLogger(FooProcessor.class);

	@Value("${test.value:0}")
	private String value;

	@Bean
	public Function<Flux<Foo>, Flux<Foo> > processFoo()
	{
		return foos -> foos.flatMap(foo ->
		{
			logger.info("!!! The test.value is: {}",  value);
			if (value != null && value.equals("X")) {
				throw new RuntimeException("Ouch!!!");
			}
			logger.info("Processing incoming {}",  foo.getClass().getName());
			return Mono.just(foo);
		});
	}
}
