package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PiirivalvurController {

	@RequestMapping(value="/Piirivalvur")
	public String piirivalvur() {
		return "Piirivalvur";
	}
	
}
