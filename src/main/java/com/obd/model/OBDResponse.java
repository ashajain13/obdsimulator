package com.obd.model;

public class OBDResponse {
	private String msg;
	private boolean status;
	private int value;
	private Response res;
	public OBDResponse(String msg, boolean status, int value, Response res) {
		super();
		this.msg = msg;
		this.status = status;
		this.value = value;
		this.res = res;
	}

	public OBDResponse() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Response getRes() {
		return res;
	}

	public void setRes(Response res) {
		this.res = res;
	}
	
}
