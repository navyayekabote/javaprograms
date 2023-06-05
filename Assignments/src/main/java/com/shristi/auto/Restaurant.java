package com.shristi.auto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Restaurant {
	@Autowired
	IFoodMenu menu;
	@Autowired
	IFoodMenu chinese;
	@Autowired
	IFoodMenu imenu;
	List<String> displayMenu(String choice){
		List<String> list=new ArrayList<>();
		if(choice.equalsIgnoreCase("chinese"))
			list=chinese.showItems();
		if(choice.equalsIgnoreCase("indian"))
			list=menu.showItems();
		if(choice.equalsIgnoreCase("continental"))
			list=imenu.showItems();
		
		return list;
	}
}
