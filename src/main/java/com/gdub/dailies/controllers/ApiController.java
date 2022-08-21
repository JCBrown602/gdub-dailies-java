package com.gdub.dailies.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;

	// private static String url =
	// "https://api.guildwars2.com/v2/achievements/daily";

	// private static String url =
	// "https://api.guildwars2.com/v2/achievements/categories/1";

	// private static String url = "https://api.guildwars2.com/v2/achievements";

	// private static String url =
	// "https://api.guildwars2.com/v2/achievements?ids=1840,910,2258";

	// private static String url = "https://restcountries.com/v3.1/all";

	private static String url = "http://ip.jsontest.com";

	@GetMapping("/dailies")
	public List<Object> getDailies() {
		Object[] dailies = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(dailies);
	}

}
