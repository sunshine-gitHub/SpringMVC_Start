package ecnu.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	@ResponseBody
	public String hello(@RequestParam(value="username", required=false)String username,
			@RequestParam(value="password", required=false)String pwd){
		//model.addAttribute("name", name);
		return "hello"+ username +", Your password is: "+pwd;
	}
}
