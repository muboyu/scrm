package com.situ.scrm.index.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String PAGE_INDEX = "index";
	
	@GetMapping(path = {"/","index"})
	public ModelAndView goIndex(ModelAndView modelAndView) {
		modelAndView.setViewName(PAGE_INDEX);
		return modelAndView;
	}

}
