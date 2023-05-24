package com.shristi.quest5;

import java.util.function.BiConsumer;

public class AdminBiConsumer {

	public static void main(String[] args) {
		BiConsumer<String,Integer> biconsumer=(name,age)->
		{
			if(name.equalsIgnoreCase("Admin")&&age>30)
			System.out.println("Welcome admin");
			else
				System.out.println("wrong user");
		};
		biconsumer.accept("Admin",34);
	}

}
