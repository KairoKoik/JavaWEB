package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PiirivalvurVaeosasController {

	@RequestMapping(value="/PiirivalvurVaeosas")
	public String PiirivalvurVaeosas() {
		return "PiirivalvurVaeosas";
	}
	
}
