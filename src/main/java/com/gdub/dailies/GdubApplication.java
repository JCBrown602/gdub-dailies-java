package com.gdub.dailies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.gdub.dailies.nodes.GameType;

@SpringBootApplication
public class GdubApplication {

	private static final Logger log = LoggerFactory.getLogger(GdubApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GdubApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String url = "https://api.guildwars2.com/v2/achievements/daily";
			GameType gameType = restTemplate.getForObject(url, GameType.class);
			log.info(gameType.toString());
		};
	}

}
