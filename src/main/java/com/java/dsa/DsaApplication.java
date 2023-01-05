package com.java.dsa;

import com.java.dsa.array.service.ArrayDSAService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);

		ArrayDSAService arrayDSAService = new ArrayDSAService();
		arrayDSAService.findDuplicateInArray();
	}
}
