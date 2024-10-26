package com.entity.view;

import com.entity.FahuodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发货订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
@TableName("fahuodingdan")
public class FahuodingdanView  extends FahuodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FahuodingdanView(){
	}
 
 	public FahuodingdanView(FahuodingdanEntity fahuodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, fahuodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
