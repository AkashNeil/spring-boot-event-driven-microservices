package io.github.seebaware.TeaService;

import io.github.seebaware.TeaService.command.api.exception.TeaServiceEventsErrorHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeaServiceApplication.class, args);
	}

	@Autowired
	public void configure(EventProcessingConfigurer configurer) {
		configurer.registerListenerInvocationErrorHandler(
				"tea",
				configuration -> new TeaServiceEventsErrorHandler()
		);
	}

}
