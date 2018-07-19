package welcome.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoadController {
	@RequestMapping(value={"/w"})
	public String returnPage() {
		
		return "index";
		
	}

}
