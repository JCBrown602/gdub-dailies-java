package com.gdub.dailies.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class CustomErrorController implements ErrorController {

	@GetMapping("/error")
	@ResponseBody
	String error(HttpServletRequest request) {
		return "<h2>ERROR: Happened</h2>";
	}
}
