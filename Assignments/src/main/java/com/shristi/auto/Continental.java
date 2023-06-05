package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("imenu")

public class Continental implements IFoodMenu {

	@Override
	public List<String> showItems() {
		List<String> list=Arrays.asList("Peri peri prawns","jerk chicken","BBQ chicken","calamari rings");
		System.out.println("the food items in continental are:");
		
		return list;
	}

}
