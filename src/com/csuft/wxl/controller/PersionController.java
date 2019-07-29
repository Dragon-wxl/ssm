package com.csuft.wxl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csuft.wxl.pojo.PageNumber;
import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.PersionService;

@Controller
public class PersionController {
	@Autowired
	PersionService persionService;

	//pageHelper实现分页
//	@RequestMapping(value = { "/listPersion" })
//	public ModelAndView listPersion(@RequestParam(required = false, defaultValue = "0") int start,
//			@RequestParam(required = false, defaultValue = "10") int rows) {
//		ModelAndView mav = new ModelAndView();
//		PageHelper.startPage(start, rows);
//		List<Persion> list = persionService.getSelect();
//		PageInfo<Persion> pageInfo = new PageInfo<Persion>(list);
//		mav.addObject("pageInfo", pageInfo);
//		mav.setViewName("listPersion");
//		return mav;
//	}
	//查询进行
	@RequestMapping(value= {"/listPersion"})
	public ModelAndView listPersion(PageNumber page) {
		
		ModelAndView mav=new ModelAndView("listPersion");
		if (page.getStart()<=0) {
			page.setStart(0);
		}
		List<Persion> list=persionService.getSelectLimit(page);
		int all=persionService.getSelectCount();
		mav.addObject("list",list);
		page.next(all);
		mav.addObject("page",page);
		return mav;
	}
	
	
//	public String getSelectPersion(Model m) {
//		
//		return "listPersion";
//	}
}
