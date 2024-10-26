package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZujiedingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZujiedingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZujiedingdanView;


/**
 * 租借订单
 *
 * @author 
 * @email 
 * @date 2021-04-04 23:32:25
 */
public interface ZujiedingdanService extends IService<ZujiedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZujiedingdanVO> selectListVO(Wrapper<ZujiedingdanEntity> wrapper);
   	
   	ZujiedingdanVO selectVO(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
   	
   	List<ZujiedingdanView> selectListView(Wrapper<ZujiedingdanEntity> wrapper);
   	
   	ZujiedingdanView selectView(@Param("ew") Wrapper<ZujiedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZujiedingdanEntity> wrapper);
   	
}

