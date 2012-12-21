package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VaeosaController {

	@RequestMapping(value="/Vaeosa")
	public String Vaeosa() {
		return "Vaeosa";
	}
	
}
