package com.rose.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@Autowired
	MySpringBean bean;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
	        model.addAttribute("title","Helo Page");
	        model.addAttribute("message", "input from 0 to 2 : ");
	        return "helo";
	    }
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String index(@RequestParam("input1")int index, Model model){
		MyData data=bean.getData(index);
		model.addAttribute("title", "Answer");
		model.addAttribute("message", data);
		return "helo";
	}

}
