package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements IFoodMenu {

	@Override
	public List<String> showItems() {
		List<String> list=Arrays.asList("noodles","gobi manchurain","soup");
		System.out.println("the food items in chinese are:");
		return list;
	}

}
