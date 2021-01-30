package com.sjy.OA_Sys.bean;

import java.io.Serializable;

/**
 * 结果类
 * --未完成
 * @author 沈俊羽
 *
 */
public class Result implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int sucess;// 是否成功 0 失败  1 成功
	private String message;// 消息
	private Object obj;// 对象
	
	public Result() {
	}
	public Result(int sucess) {
		this.sucess = sucess;
	}
	public Result(int sucess, Object obj) {
		this.sucess = sucess;
		this.obj = obj;
	}
	public Result(int sucess, String message) {
		this.sucess = sucess;
		this.message = message;
	}
	public Result(int sucess, String message, Object obj) {
		this.sucess = sucess;
		this.message = message;
		this.obj = obj;
	}
	
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public int getSucess() {
		return sucess;
	}
	public void setSucess(int sucess) {
		this.sucess = sucess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
