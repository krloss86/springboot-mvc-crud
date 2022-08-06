package com.educacionit.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educacionit.springmvc.domain.Cupones;
import com.educacionit.springmvc.services.CuponService;

@Controller
@RequestMapping("/cupon")
public class CuponController {

	@Autowired
	private CuponService cuponService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Cupones> cupones = this.cuponService.findAll();

		model.addAttribute("CUPONES", cupones);
		
		Cupones cuponVacio = new Cupones();
		model.addAttribute("CUPON", cuponVacio);
		
		return "list";
	}
	
	@PostMapping("/save")
	public String save(
			@ModelAttribute(name="CUPON") Cupones cupon
		) {
		
		this.cuponService.save(cupon);
		
		return "redirect:/cupon/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(
		@PathVariable(value="id", required=true)
		Long id
		) {
		
		this.cuponService.delete(id);
		
		return "redirect:/cupon/list";
	}
	
	@GetMapping("/preedit/{id}")
	public String preEdit(
		Model model,
		@PathVariable(value="id", required=true)
		Long id
		) {
		
		Cupones cupon = this.cuponService.get(id);
		
		model.addAttribute("CUPON", cupon);
		
		List<Cupones> cupones = this.cuponService.findAll();

		model.addAttribute("CUPONES", cupones);
		
		return "list";
	}
}
