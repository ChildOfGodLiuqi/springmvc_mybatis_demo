package com.zxl.app.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

/**
 * 请求响应基类
 * @author zxl
 *
 */
public class ServiceResponseBase implements Serializable {

	/**
	  * @Fields serialVersionUID : TODO
	  */
	private static final long serialVersionUID = -1875796154920240291L;

	/**
	 * 0表示正常   1业务异常  -1系统异常
	 */
	private Integer responseCode = 0;
	/**
	 * 错误信息
	 */
	private String errorMessage = "";
	/**
	 * 堆栈信息
	 */
	private String stackTrace = "";

	public ServiceResponseBase() {

	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public void setException(Exception e) {
		StringWriter writer = new StringWriter();
		e.printStackTrace(new PrintWriter(writer));
		this.stackTrace = writer.getBuffer().toString();
		try {
			writer.close();
		} catch (IOException e1) {
		}
	}

	public void addException(Exception e) {
		StringWriter writer = new StringWriter();
		e.printStackTrace(new PrintWriter(writer));
		this.stackTrace += writer.getBuffer().toString();
		try {
			writer.close();
		} catch (IOException e1) {
		}
	}

}

