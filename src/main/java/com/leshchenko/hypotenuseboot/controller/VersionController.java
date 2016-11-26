package com.leshchenko.hypotenuseboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leshchenko.hypotenuseboot.model.VersionGenerator;

@Controller
public class VersionController {

	@RequestMapping(value = "/version", method = RequestMethod.POST)
	public String version(Model model) {
		model.addAttribute("version", VersionGenerator.VERSION);
		return "version";
	}

}
