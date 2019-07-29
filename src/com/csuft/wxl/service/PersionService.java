package com.csuft.wxl.service;

import java.util.List;

import com.csuft.wxl.pojo.PageNumber;
import com.csuft.wxl.pojo.Persion;

public interface PersionService {
	List<Persion> getSelect();
	List<Persion> getSelectLimit(PageNumber page);
	int getSelectCount();
	int getInsert(Persion persion);
	int getUpdata(Persion persion);
	int getDelete(int id);
}
