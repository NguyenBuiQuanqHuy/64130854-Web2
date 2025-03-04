package huy.ntu.edu.ChaosSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChaosController {
	@RequestMapping("/chao")
	public String xin_Chao() {
		//code xu? ly' o? day
		return "helloView";
	}
}
