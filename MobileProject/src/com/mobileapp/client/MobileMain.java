package com.mobileapp.client;
import java.util.*;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class MobileMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MobileService mobileService=new MobileServiceImpl();
		System.out.println("---------");
		System.out.println("All Mobiles details are");
		Mobile[] mobile=mobileService.getAll();
		for(Mobile mobiles:mobile)
		{
			System.out.println(mobiles);
		}
		System.out.println("-----------");
		try
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			Mobile mobileid=mobileService.getId(id);
			System.out.println("Mobile by id is");
			System.out.println(mobileid);
			System.out.println("-----------");
			
			System.out.println("Enter brand");
			String brand=sc.next();
			Mobile[] mobilebrand=mobileService.getByBrand(brand);
			System.out.println("Mobile by brand are");
			for(Mobile mobilebybrand:mobilebrand) {
				System.out.println(mobilebybrand);
			}
		}catch(MobileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
