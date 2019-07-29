package com.csuft.wxl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csuft.wxl.mapper.PersionMap;
import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.PersionService;

@Service
public class PersionServiceimpl implements PersionService {
	@Autowired
	PersionMap persionMap;

	@Override
	public List<Persion> getList() {
		// TODO Auto-generated method stub
		return persionMap.selectAll();
	}

}
