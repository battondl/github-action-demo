package com.github_actions_demo.github_actions_demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GithubActionsDemoApplication {

	public static void main(String[] args) {
		log.info("Starting application ===>>> github-action-demo");
		SpringApplication.run(GithubActionsDemoApplication.class, args);
	}

}
