package com.obd.model;

import java.util.Date;

public class Response {
	private Date timestamp;
	private int value;
	private String pretty;
	private String pid;
	private String name;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getPretty() {
		return pretty;
	}
	public void setPretty(String pretty) {
		this.pretty = pretty;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Response(Date timestamp, int value, String pretty, String pid, String name) {
		super();
		this.timestamp = new Date();
		this.value = value;
		this.pretty = pretty;
		this.pid = pid;
		this.name = name;
	}
	public Response() {
		super();
		
	}
	
	
	
	

}
