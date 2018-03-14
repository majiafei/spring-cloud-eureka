package org.giveucredit.springcloud.euraka.mjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	@ResponseBody
	public void hello(){
		System.out.println("======");
	}

}
