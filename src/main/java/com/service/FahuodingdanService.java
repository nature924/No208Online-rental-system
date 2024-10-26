package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FahuodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FahuodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FahuodingdanView;


/**
 * 发货订单
 *
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface FahuodingdanService extends IService<FahuodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FahuodingdanVO> selectListVO(Wrapper<FahuodingdanEntity> wrapper);
   	
   	FahuodingdanVO selectVO(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
   	
   	List<FahuodingdanView> selectListView(Wrapper<FahuodingdanEntity> wrapper);
   	
   	FahuodingdanView selectView(@Param("ew") Wrapper<FahuodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FahuodingdanEntity> wrapper);
   	
}

