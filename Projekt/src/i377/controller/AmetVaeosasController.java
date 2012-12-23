package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmetVaeosasController {

	@RequestMapping(value="/AmetVaeosas")
	public String AmetVaeosas() {
		return "AmetVaeosas";
	}
	
	@RequestMapping(value="/AddAmetVaeosas")
	public String AddAmetVaeosas() {
		return "AmetVaeosas";
	}
	
}
