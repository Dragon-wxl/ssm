package com.csuft.wxl.test;

import java.util.List;

import org .junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csuft.wxl.pojo.PageNumber;
import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.PersionService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SsmTest {
	@Autowired
	PersionService persionService;
//	@Test
//	public void getList() {
//		List<Persion> list=persionService.getSelect();
//		for (Persion persion : list) {
//			System.out.println(persion);
//		}
//	}
//	@Test
//	public void getInsert() {
//		Persion persion=new Persion();
//		persion.setName("上官");
//		persion.setBirthday("1898-8-5");
//		persion.setSex(1);
//		persion.setDepartment("生产部门");
//		int result=persionService.getInsert(persion);
//		System.out.println(result);
//		getList();
//	}
	@Test
	public void getListLimit() {
		PageNumber page=new PageNumber();
		page.setStart(0);
		page.setCount(25);
		List<Persion> list=persionService.getSelectLimit(page);
		int a=persionService.getSelectCount();
		System.out.println("总数："+a);
		for (Persion persion : list) {
			System.out.println(persion);
		}
	}
	
}
