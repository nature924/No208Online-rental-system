package com.dao;

import com.entity.XinyuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinyuzhiVO;
import com.entity.view.XinyuzhiView;


/**
 * 信誉值
 * 
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface XinyuzhiDao extends BaseMapper<XinyuzhiEntity> {
	
	List<XinyuzhiVO> selectListVO(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
	
	XinyuzhiVO selectVO(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
	
	List<XinyuzhiView> selectListView(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);

	List<XinyuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
	
	XinyuzhiView selectView(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
	
}
