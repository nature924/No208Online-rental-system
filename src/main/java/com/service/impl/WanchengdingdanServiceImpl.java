package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WanchengdingdanDao;
import com.entity.WanchengdingdanEntity;
import com.service.WanchengdingdanService;
import com.entity.vo.WanchengdingdanVO;
import com.entity.view.WanchengdingdanView;

@Service("wanchengdingdanService")
public class WanchengdingdanServiceImpl extends ServiceImpl<WanchengdingdanDao, WanchengdingdanEntity> implements WanchengdingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengdingdanEntity> page = this.selectPage(
                new Query<WanchengdingdanEntity>(params).getPage(),
                new EntityWrapper<WanchengdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengdingdanEntity> wrapper) {
		  Page<WanchengdingdanView> page =new Query<WanchengdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanchengdingdanVO> selectListVO(Wrapper<WanchengdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengdingdanVO selectVO(Wrapper<WanchengdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengdingdanView> selectListView(Wrapper<WanchengdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengdingdanView selectView(Wrapper<WanchengdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
