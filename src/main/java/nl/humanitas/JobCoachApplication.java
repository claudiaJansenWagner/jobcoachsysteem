package nl.humanitas;

//import nl.humanitas.config.ApplicationConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
//@Import(ApplicationConfig.class)
@SpringBootApplication
public class JobCoachApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobCoachApplication.class, args);
	}
}
