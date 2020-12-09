package com.obd.model;

public class Pid {

	private String name;
	private int max;
	private int min;
	private String unit;
	private String pid;
	public Pid(String name, int max, int min, String unit, String pid) {
		super();
		this.name = name;
		this.max = max;
		this.min = min;
		this.unit = unit;
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
