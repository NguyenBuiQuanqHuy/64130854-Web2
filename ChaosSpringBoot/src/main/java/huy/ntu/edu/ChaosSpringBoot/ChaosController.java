package huy.ntu.edu.ChaosSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChaosController {
	@GetMapping("/chao")
	public String xin_Chao(ModelMap m) {
		m.addAttribute("tb","Dữ liệu thông báo");
		return "helloView";
	}
}
