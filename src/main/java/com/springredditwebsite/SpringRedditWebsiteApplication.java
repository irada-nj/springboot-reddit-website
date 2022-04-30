package com.springredditwebsite;

import com.springredditwebsite.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringRedditWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedditWebsiteApplication.class, args);
	}

}
