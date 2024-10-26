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


import com.dao.ZujiedingdanDao;
import com.entity.ZujiedingdanEntity;
import com.service.ZujiedingdanService;
import com.entity.vo.ZujiedingdanVO;
import com.entity.view.ZujiedingdanView;

@Service("zujiedingdanService")
public class ZujiedingdanServiceImpl extends ServiceImpl<ZujiedingdanDao, ZujiedingdanEntity> implements ZujiedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZujiedingdanEntity> page = this.selectPage(
                new Query<ZujiedingdanEntity>(params).getPage(),
                new EntityWrapper<ZujiedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZujiedingdanEntity> wrapper) {
		  Page<ZujiedingdanView> page =new Query<ZujiedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZujiedingdanVO> selectListVO(Wrapper<ZujiedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZujiedingdanVO selectVO(Wrapper<ZujiedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZujiedingdanView> selectListView(Wrapper<ZujiedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZujiedingdanView selectView(Wrapper<ZujiedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
