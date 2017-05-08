package com.app.util;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author 王伟华
 * @date 2015-10-2 下午5:05:35
 * @Description:工具类
 */
public class CommonUtils {

	/**
	 * 生成随机四位数字
	 * @return int
	 */
	public static int randomFour() {
		int index = (int) (Math.random() * 9000 + 1000);
		return index;
	}

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 获取客户端ip
	 * @param request
	 * @return
	 */
	public static String getRemoteLoginUserIp(HttpServletRequest request){

		  String ip = request.getHeader("x-forwarded-for"); 
		  if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		  ip = request.getHeader("Proxy-Client-IP"); 
		  } 
		  if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		  ip = request.getHeader("WL-Proxy-Client-IP"); 
		  } 
		  if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getRemoteAddr(); 
		  } 
		  return ip; 
		}
}
