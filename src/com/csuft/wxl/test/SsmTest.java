package com.csuft.wxl.test;

import java.util.List;

import org .junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.impl.PersionServiceimpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SsmTest {
	@Autowired
	PersionServiceimpl persionService;
	@Test
	public void getList() {
		List<Persion> list=persionService.getList();
		for (Persion persion : list) {
			System.out.println(persion);
		}
	}
}
