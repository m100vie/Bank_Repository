package com.exercice.bank_application;

import java.util.*;
import com.exercice.bank_application.Model;

import ch.qos.logback.core.boolex.Matcher;

import java.io.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {


	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);

		Controller controller = new Controller();
	}
}

