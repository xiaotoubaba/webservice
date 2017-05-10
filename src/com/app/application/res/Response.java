package com.app.application.res;

/**
 * @author xujiashuai@jovision.com
 * @date 2016年4月1日 下午4:37:15
 * 
 */
public class Response<T> {
	private int rt;
	private String errmsg;
	private T param;
	
	public Response(){}
	
	public Response(int errcode, String errmsg ){
		this(errcode, errmsg, null);
	}
	public Response(int errcode, String errmsg, T param){
		this.rt = errcode;
		this.errmsg = errmsg;
		this.param = param;
	}
	
	public int getRt() {
		return rt;
	}

	public void setRt(int rt) {
		this.rt = rt;
	}

	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public T getParam() {
		return param;
	}

	public void setParam(T param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "Response [rt=" + rt + ", errmsg=" + errmsg + ", content=" + param + "]";
	}
}
