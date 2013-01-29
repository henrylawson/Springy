package net.henrylawson.firstspringmvc.controller;

import net.henrylawson.firstspringmvc.model.Form;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String index(Model model) {
		String message = "Welcome to my crappy website!";
		model.addAttribute("message", message);
		return "index";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("form", new Form());
		return "form";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String saveForm(@Valid Form form, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "form";
		}
		
		model.addAttribute("successMessage", "Saved " + form.getName() + " who is " + form.getAge());
		return "success";
	}
}
