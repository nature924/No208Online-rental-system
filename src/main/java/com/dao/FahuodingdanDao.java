package com.dao;

import com.entity.FahuodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FahuodingdanVO;
import com.entity.view.FahuodingdanView;


/**
 * 发货订单
 * 
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface FahuodingdanDao extends BaseMapper<FahuodingdanEntity> {
	
	List<FahuodingdanVO> selectListVO(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
	
	FahuodingdanVO selectVO(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
	
	List<FahuodingdanView> selectListView(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);

	List<FahuodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
	
	FahuodingdanView selectView(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
	
}
