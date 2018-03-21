package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
@RequestMapping("/hi")
public String greeting(@RequestParam(value="firstname", required=false, defaultValue="world") String firstname, 
		@RequestParam(value="lastname", required=false, defaultValue="world") String lastname, 
		
		Model model) {
model.addAttribute("fname", firstname);
model.addAttribute("lname", lastname);
return "greeting";
}


}