package com.csuft.wxl.mapper;

import java.util.List;

import com.csuft.wxl.pojo.PageNumber;
import com.csuft.wxl.pojo.Persion;
public interface PersionMap {
	//查
	public List<Persion> selectAll();
	//
	public List<Persion> selectLimit(PageNumber page); 
	//
	public int selectCount();
	//增 persion
	public int insertOne(Persion persion);
	//改
	public int updataPersion(Persion persion);
	//删
	public int deletePersion(int id);
}
