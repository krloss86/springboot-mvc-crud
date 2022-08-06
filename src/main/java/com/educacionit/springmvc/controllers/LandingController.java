package com.educacionit.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

	@RequestMapping(value={"/", "/home"})
	public String home() {
		//dar la nombre del archivo
		return "redirect:/cupon/list";
	}
}
