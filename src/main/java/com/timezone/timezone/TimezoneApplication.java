package com.timezone.timezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.ParseException;

@SpringBootApplication
public class TimezoneApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(TimezoneApplication.class, args);
	}
}
