package com.example.kubernetes.kubernetesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aleksandar.kovachev
 */
@RestController
public class Controller {

	// @Value("${test.text}")
	// private String text;

	@GetMapping("/test")
	public String test() {
		return "Test from kubernetes";
	}

}
