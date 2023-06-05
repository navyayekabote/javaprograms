package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Automain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi");
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
		Restaurant restaurant=context.getBean(Restaurant.class);
		List<String> list=restaurant.displayMenu("indian");
		list.stream()
		.forEach(System.out::println);
	}

}
