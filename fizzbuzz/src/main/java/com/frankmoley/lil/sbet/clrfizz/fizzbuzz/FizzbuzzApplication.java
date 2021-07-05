package com.frankmoley.lil.sbet.clrfizz.fizzbuzz;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			for (int i=1; i<=100; i++){
				String res = "";
				res+= (i%3) == 0? "Fizz": "";
				res+= (i%5) == 0? "Buzz": "";
				System.out.println(!res.isEmpty()? res: i);;
			}
		};
	}

}
