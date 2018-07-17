package com.paul.zmm_boot;

import com.paul.service.ServiceOne;
import com.paul.utils.ServiceTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@ComponentScan("com.paul")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);

	}

}
