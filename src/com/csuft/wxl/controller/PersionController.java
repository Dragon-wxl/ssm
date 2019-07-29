package com.csuft.wxl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.service.PersionService;

@Controller
@RequestMapping("")
public class PersionController {
	@Autowired
	PersionService persionService;
	@RequestMapping("listPersion")
	public ModelAndView listPersion() {
		ModelAndView mav=new ModelAndView();
		List<Persion> list=persionService.getList();
		mav.addObject("list",list);
		mav.setViewName("listPersion");
		return mav;
	}
}
