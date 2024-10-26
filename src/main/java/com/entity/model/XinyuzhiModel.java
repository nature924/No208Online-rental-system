package com.entity.model;

import com.entity.XinyuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 信誉值
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public class XinyuzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 信誉值
	 */
	
	private String xinyuzhi;
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：信誉值
	 */
	 
	public void setXinyuzhi(String xinyuzhi) {
		this.xinyuzhi = xinyuzhi;
	}
	
	/**
	 * 获取：信誉值
	 */
	public String getXinyuzhi() {
		return xinyuzhi;
	}
			
}
