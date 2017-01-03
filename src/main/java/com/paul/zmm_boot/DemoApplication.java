package com.paul.zmm_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paul.spring.AuthorSettings;

@RestController
@SpringBootApplication
@ComponentScan("com.paul")
public class DemoApplication {
	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@Autowired
	private AuthorSettings author;

	/*
	 * @RequestMapping("/") public String index() { return "Hello Spring Boot" +
	 * bookAuthor + bookName; }
	 */

	@RequestMapping(value = "/")
	@ResponseBody
	public String author() {
		return author.getName() + author.getAge();
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);
	}

}
