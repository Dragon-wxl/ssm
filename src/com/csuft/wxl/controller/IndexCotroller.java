package com.csuft.wxl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCotroller {
	@RequestMapping(value= {"/index"})
	public String index() {
		return "index";	
	}
}
