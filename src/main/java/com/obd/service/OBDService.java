package com.obd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obd.model.OBDResponse;
import com.obd.model.Pid;
import com.obd.model.Response;
import com.obd.util.DataGenerator;
import com.obd.util.PidInfo;

@Service
public class OBDService {
	
	@Autowired
	private PidInfo pidinfo; 
	@Autowired
	private DataGenerator datagen;
	
	public OBDResponse getsnapshot(String pidno)
	{
		if(!pidinfo.containspid(pidno))
			return new OBDResponse("PID not Supported",false,0,null);
		else
			{
				Pid pid =pidinfo.getpidinfo(pidno);
				int value = datagen.getData(pid.getMax(), pid.getMin());
				
				return new OBDResponse("PID is Supported",true,value,new Response(null, value, value+pid.getUnit(), pid.getPid(), pid.getName()));
			}
	}

}
