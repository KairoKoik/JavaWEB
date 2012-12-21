package i377.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmetController {

	@RequestMapping("/Amet")
	public String Amet() {
		return "Amet";
	}
}
