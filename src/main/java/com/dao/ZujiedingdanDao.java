package com.dao;

import com.entity.ZujiedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZujiedingdanVO;
import com.entity.view.ZujiedingdanView;


/**
 * 租借订单
 * 
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface ZujiedingdanDao extends BaseMapper<ZujiedingdanEntity> {
	
	List<ZujiedingdanVO> selectListVO(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
	
	ZujiedingdanVO selectVO(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
	
	List<ZujiedingdanView> selectListView(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);

	List<ZujiedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
	
	ZujiedingdanView selectView(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
	
}
