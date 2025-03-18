package huy.ntu.edu.TruyenDLSangView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest request) {
		String id =request.getParameter("id");
		String pass= request.getParameter("pass");
		if(id.equals("64130854") && pass.equals("21082004")) {
			model.addAttribute("message","Đăng nhập thành công");
			return "redirect:/profile";
		}
		else {
			model.addAttribute("message","Sai thông tin đăng nhập");
		}
		return "login";
	}
}
