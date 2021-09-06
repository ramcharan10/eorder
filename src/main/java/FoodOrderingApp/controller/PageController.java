package FoodOrderingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/login")
	public String showLogin() {
		return "Login";
	}
	
	@RequestMapping("/register")
	public String showRegister() {
		return "Register";
	}
	
	@RequestMapping("/about-us")
	public String showAboutUs() {
		return "AboutUs";
	}
	
	@RequestMapping("/contact-us")
	public String showContactUs() {
		return "ContactUs";
	}

}
