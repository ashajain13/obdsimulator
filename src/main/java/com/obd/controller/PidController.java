package com.obd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.obd.model.OBDResponse;
import com.obd.service.OBDService;

@RestController
public class PidController {
	
	@Autowired
	private OBDService obdserv;
	
	@RequestMapping(method=RequestMethod.GET,path="/info/{pid}")
	public OBDResponse getData(@PathVariable("pid")String pid)
	{
		return obdserv.getsnapshot(pid);
	}

}
