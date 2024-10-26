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


import com.dao.XinyuzhiDao;
import com.entity.XinyuzhiEntity;
import com.service.XinyuzhiService;
import com.entity.vo.XinyuzhiVO;
import com.entity.view.XinyuzhiView;

@Service("xinyuzhiService")
public class XinyuzhiServiceImpl extends ServiceImpl<XinyuzhiDao, XinyuzhiEntity> implements XinyuzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinyuzhiEntity> page = this.selectPage(
                new Query<XinyuzhiEntity>(params).getPage(),
                new EntityWrapper<XinyuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinyuzhiEntity> wrapper) {
		  Page<XinyuzhiView> page =new Query<XinyuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinyuzhiVO> selectListVO(Wrapper<XinyuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinyuzhiVO selectVO(Wrapper<XinyuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinyuzhiView> selectListView(Wrapper<XinyuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinyuzhiView selectView(Wrapper<XinyuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
