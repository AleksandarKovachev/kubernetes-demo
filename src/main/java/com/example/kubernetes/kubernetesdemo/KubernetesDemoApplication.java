package com.example.kubernetes.kubernetesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KubernetesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesDemoApplication.class, args);
	}

}
