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


import com.dao.FahuodingdanDao;
import com.entity.FahuodingdanEntity;
import com.service.FahuodingdanService;
import com.entity.vo.FahuodingdanVO;
import com.entity.view.FahuodingdanView;

@Service("fahuodingdanService")
public class FahuodingdanServiceImpl extends ServiceImpl<FahuodingdanDao, FahuodingdanEntity> implements FahuodingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FahuodingdanEntity> page = this.selectPage(
                new Query<FahuodingdanEntity>(params).getPage(),
                new EntityWrapper<FahuodingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FahuodingdanEntity> wrapper) {
		  Page<FahuodingdanView> page =new Query<FahuodingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FahuodingdanVO> selectListVO(Wrapper<FahuodingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FahuodingdanVO selectVO(Wrapper<FahuodingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FahuodingdanView> selectListView(Wrapper<FahuodingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FahuodingdanView selectView(Wrapper<FahuodingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
