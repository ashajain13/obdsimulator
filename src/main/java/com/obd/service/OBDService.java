package com.obd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obd.model.OBDResponse;
import com.obd.model.ObdData;
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
	public ObdData getData()
	{
		return new ObdData(getsnapshot("0D").getValue(),getsnapshot("0C").getValue(),getsnapshot("2F").getValue(),getsnapshot("05").getValue(),getsnapshot("04").getValue(), getsnapshot("0A").getValue(), getsnapshot("0B").getValue(), getsnapshot("0F").getValue(), getsnapshot("10").getValue(), getsnapshot("11").getValue());
	}
	         

}
