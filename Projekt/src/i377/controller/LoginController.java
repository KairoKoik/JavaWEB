package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

	@RequestMapping(value="/Login")
	public String main (Model model){
		return "Login";
	}
	
}
