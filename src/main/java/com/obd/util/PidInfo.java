package com.obd.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.obd.model.Pid;

@Component
public class PidInfo {
	
	private Map<String,Pid> pidlist=new HashMap<String,Pid>();
	PidInfo()
	{
		super();
		pidlist.put("2F", new Pid("Fuel Level", 100, 0, "%", "2F"));
		pidlist.put("0C", new Pid("Engine RPM", 17000, 1100, "", "0C"));
		pidlist.put("05", new Pid("Engine Coolant Temperature", 215, -40, "C", "05"));
		pidlist.put("0D", new Pid("Vehicle Speed", 255, 0, "Km/h", "0D"));
		pidlist.put("04", new Pid("Calculated Engine Load", 100, 0, "%", "04"));
		pidlist.put("0A", new Pid("Fuel Pressure", 765, 0, "kPa", "0A"));
		pidlist.put("0B", new Pid("Intake Manifold Absolute Pressure", 255, 0, "kPa", "0B"));
		pidlist.put("0F", new Pid("Intake Air Temperature", 215, -50, "C", "0F"));
		pidlist.put("10", new Pid("MAF Air Flow Rate", 655, 0, "grams/s", "10"));
		pidlist.put("11", new Pid("Throttle Position", 100, 0, "%", "11"));		
		 
	}
	
	public Pid getpidinfo(String pid)
	{
		return pidlist.get(pid);
	}
	public boolean containspid(String pid)
	{
		return pidlist.containsKey(pid);
	}
	

}
