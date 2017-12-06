package com.syiaas.pojo;

public class State {
	private boolean	result;					//true	false
	private String msg;                     //返回成功或失败的提示信息	
	private int statusCode;					//状态码
	private Object responseBean;			//返回值
	
	
	
	
	
	@Override
	public String toString() {
		return "State [result=" + result + ", msg=" + msg + ", statusCode=" + statusCode + ", responseBean="
				+ responseBean + "]";
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(boolean result, String msg, int statusCode, Object responseBean) {
		super();
		this.result = result;
		this.msg = msg;
		this.statusCode = statusCode;
		this.responseBean = responseBean;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Object getResponseBean() {
		return responseBean;
	}
	public void setResponseBean(Object responseBean) {
		this.responseBean = responseBean;
	}
	
	
	
	
	
	
}
