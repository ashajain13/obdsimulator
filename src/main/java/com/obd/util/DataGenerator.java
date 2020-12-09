package com.obd.util;

import org.springframework.stereotype.Component;

@Component
public class DataGenerator {
	
	public int getData(int max,int min)
	{
		return (((int)(Math.random()*1000)%max)+min-1);
	}

}
