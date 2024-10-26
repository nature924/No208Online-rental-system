package com.dao;

import com.entity.WanchengdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengdingdanVO;
import com.entity.view.WanchengdingdanView;


/**
 * 完成订单
 * 
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface WanchengdingdanDao extends BaseMapper<WanchengdingdanEntity> {
	
	List<WanchengdingdanVO> selectListVO(@Param("ew") Wrapper<WanchengdingdanEntity> wrapper);
	
	WanchengdingdanVO selectVO(@Param("ew") Wrapper<WanchengdingdanEntity> wrapper);
	
	List<WanchengdingdanView> selectListView(@Param("ew") Wrapper<WanchengdingdanEntity> wrapper);

	List<WanchengdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengdingdanEntity> wrapper);
	
	WanchengdingdanView selectView(@Param("ew") Wrapper<WanchengdingdanEntity> wrapper);
	
}
