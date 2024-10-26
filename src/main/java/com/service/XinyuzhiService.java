package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinyuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinyuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinyuzhiView;


/**
 * 信誉值
 *
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface XinyuzhiService extends IService<XinyuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinyuzhiVO> selectListVO(Wrapper<XinyuzhiEntity> wrapper);
   	
   	XinyuzhiVO selectVO(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
   	
   	List<XinyuzhiView> selectListView(Wrapper<XinyuzhiEntity> wrapper);
   	
   	XinyuzhiView selectView(@Param("ew") Wrapper<XinyuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinyuzhiEntity> wrapper);
   	
}

