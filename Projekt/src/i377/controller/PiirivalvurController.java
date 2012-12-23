package i377.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PiirivalvurController {

	@RequestMapping(value="/Piirivalvur")
	public String Piirivalvur() {
		return "Piirivalvur";
	}
	
	@RequestMapping(value="/AddPiirivalvur")
	public String AddPiirivalvur() {
		return "Piirivalvur";
	}
	
}
