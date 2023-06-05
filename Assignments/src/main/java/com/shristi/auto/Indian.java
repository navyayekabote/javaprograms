package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("menu")

public class Indian implements IFoodMenu {

	@Override
	public List<String> showItems() {
		List<String> list=Arrays.asList("sambarrice","idli","biryani","dosa");
		System.out.println("the food items in indian are:");
		return list;
	}

}
