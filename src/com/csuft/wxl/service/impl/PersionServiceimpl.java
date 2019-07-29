package com.csuft.wxl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csuft.wxl.mapper.PersionMap;
import com.csuft.wxl.pojo.PageNumber;
import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.PersionService;

@Service
public class PersionServiceimpl implements PersionService {
	@Autowired
	PersionMap persionMap;

	@Override
	public List<Persion> getSelect() {
		// TODO Auto-generated method stub
		return persionMap.selectAll();
	}

	@Override
	public int getInsert(Persion persion) {
		// TODO Auto-generated method stub
		return persionMap.insertOne(persion);
	}

	@Override
	public int getUpdata(Persion persion) {
		// TODO Auto-generated method stub
		return persionMap.updataPersion(persion);
	}

	@Override
	public int getDelete(int id) {
		// TODO Auto-generated method stub
		return persionMap.deletePersion(id);
	}

	@Override
	public List<Persion> getSelectLimit(PageNumber page) {
		// TODO Auto-generated method stub
		return persionMap.selectLimit(page);
	}

	@Override
	public int getSelectCount() {
		// TODO Auto-generated method stub
		return persionMap.selectCount();
	}

}
