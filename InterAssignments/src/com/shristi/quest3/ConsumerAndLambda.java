package com.shristi.quest3;

import java.util.function.BiConsumer;

public class ConsumerAndLambda {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bicon=(num1,num2)->System.out.println("Addition of 2 numbers is"+(num1+num2));
		bicon.accept(34,55);
	}

}
 