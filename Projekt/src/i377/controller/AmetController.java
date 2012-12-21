package i377.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmetController {

	@RequestMapping(value="/Amet")
	public String amet() {
		return "Amet";
	}
}
