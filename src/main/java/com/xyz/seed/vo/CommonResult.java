package com.xyz.seed.vo;

import com.xyz.seed.utils.Constants;

public class CommonResult<T> {

	private int retCode;
	private String msg;
	private T data;

	public CommonResult() {
		super();
	}

	public CommonResult(String msg, T data) {
		super();
		this.msg = msg;
		this.data = data;
	}

	public CommonResult(int retCode, String msg, T data) {
		super();
		this.retCode = retCode;
		this.msg = msg;
		this.data = data;
	}

	public void generateOKMessage() {
		this.setRetCode(Constants.HTTP_RET_CODE_SUCCESS);
		this.setMsg(Constants.MESSAGE_SUCCESS);
	}

	public void generateOKMessage(T result) {
		this.setData(result);
		this.setRetCode(Constants.HTTP_RET_CODE_SUCCESS);
		this.setMsg(Constants.MESSAGE_SUCCESS);
	}

	public void generateErrorMessage(Throwable e) {
		this.setMsg(e.getMessage());
		this.setRetCode(Constants.HTTP_RET_CODE_SERVER_ERROR);
	}

	public void generateErrorMessage(String msg) {
		this.setMsg(msg);
		this.setRetCode(Constants.HTTP_RET_CODE_SERVER_ERROR);
	}

	public void generateErrorMessage(int errorCode, String message) {
		this.setRetCode(errorCode);
		this.setMsg(message);
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
