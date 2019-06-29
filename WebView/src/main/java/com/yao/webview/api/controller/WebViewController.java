package com.yao.webview.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class WebViewController
{
	
	@RequestMapping("index")
	public String getIndex() {
		
		return "index";
	}
}
