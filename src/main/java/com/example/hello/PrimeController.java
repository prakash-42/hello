package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PrimeController {
	
	String s = "Hi there!!";
	String focusOnInputBox = "false";
	@RequestMapping("/")
    public String hello(@RequestParam(value="name", defaultValue="") String name, Model model) {
		if(!name.isEmpty()) {
			focusOnInputBox = "true";
			s = s + "<br>" + name;
		}
		
		name = s;
		model.addAttribute("name", name);
		model.addAttribute("focusOnInputBox", focusOnInputBox);
		return "index";
    }
	
	@RequestMapping("/resetFocusOnInputBox")
    public String resetFocus(Model model) {
		focusOnInputBox = "false";
		return hello("", model);
    }
}