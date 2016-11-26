package com.leshchenko.hypotenuseboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leshchenko.hypotenuseboot.model.Triangle;

@Controller
public class TriangleController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String triangleForm(Model model) {
		model.addAttribute("triangle", new Triangle());
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String triangleSubmit(@ModelAttribute Triangle triangle, Model model) {
		model.addAttribute("hypotenuse", triangle.hypotenuse());
		model.addAttribute("triangle", triangle);
		return "result";
	}

}
