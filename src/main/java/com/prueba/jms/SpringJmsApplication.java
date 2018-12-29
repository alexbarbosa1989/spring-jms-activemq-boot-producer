package com.prueba.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.prueba.jms.producer.Sender;

@SpringBootApplication
public class SpringJmsApplication {

	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for(int i=0; i < 500; i++)
                	sender.send("Mensaje "+i);
                		
            }
        };
    }
}
