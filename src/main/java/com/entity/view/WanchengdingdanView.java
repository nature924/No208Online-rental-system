package com.entity.view;

import com.entity.WanchengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 完成订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
@TableName("wanchengdingdan")
public class WanchengdingdanView  extends WanchengdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanchengdingdanView(){
	}
 
 	public WanchengdingdanView(WanchengdingdanEntity wanchengdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, wanchengdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
