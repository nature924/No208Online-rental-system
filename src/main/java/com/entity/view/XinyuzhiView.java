package com.entity.view;

import com.entity.XinyuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信誉值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
@TableName("xinyuzhi")
public class XinyuzhiView  extends XinyuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinyuzhiView(){
	}
 
 	public XinyuzhiView(XinyuzhiEntity xinyuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, xinyuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
