package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getId(int id) throws MobileNotFoundException {
		Mobile[] mobiles=allMobiles();
		Mobile mobileid=new Mobile();
		int count=0;
		for(Mobile mobilebyid:mobiles)
		{
			if(mobilebyid.getMobileId()==(id))
			{
				mobileid=mobilebyid;
				count++;
			}
		}
		if(count==0)
		{
			throw new MobileNotFoundException("mobile  with that id is not found");
		}
		return mobileid;
	}

	@Override
	public Mobile[] getAll() {
		Mobile[] mobiles=allMobiles();
		return mobiles;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		Mobile[] mobiles=allMobiles();
		int count=0;
		for(Mobile mobile:mobiles)
		{
			if(mobile.getBrand().equalsIgnoreCase(brand))
				count++;
		}
		if(count==0)
		{
			throw new MobileNotFoundException("mobiles with that brand not found");
		}
		Mobile[] mobilebybrand=new Mobile[count];
		int i=0;
		for(Mobile mobile:mobiles)
		{
			if(mobile.getBrand().equalsIgnoreCase(brand))
			mobilebybrand[i++]=mobile;
		}
		return mobilebybrand;
	}
	private Mobile[] allMobiles() {
		Mobile[] mobiles=new Mobile[7];
		mobiles[0]=new Mobile(1,"A113","Samsung",34343);
		mobiles[1]=new Mobile(2,"RENO8T","Oppo",3545);
		mobiles[2]=new Mobile(4,"F21","Oppo",4512);
		mobiles[3]=new Mobile(3,"S16","vivo",20000);
		mobiles[4]=new Mobile(5,"K3NOTE","apple",80000);
		mobiles[5]=new Mobile(7,"K6","lenovo",5545);
		mobiles[6]=new Mobile(8,"W30","lg",6565);
		return mobiles;
	}

}
