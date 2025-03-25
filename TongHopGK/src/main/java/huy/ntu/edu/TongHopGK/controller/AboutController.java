package huy.ntu.edu.TongHopGK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
	@GetMapping("/about")
	public String thongtinSV(ModelMap model) {
	    model.addAttribute("hoTen", "Nguyễn Bùi Quang Huy");
	    model.addAttribute("ngaySinh", "21/08/2004");
	    model.addAttribute("truong", "Đại học Nha Trang");
	    model.addAttribute("mssv", "64130854");
	    model.addAttribute("diaChi", "Ninh Hòa - Khánh Hòa");
	    model.addAttribute("soDienThoai", "0364454522");
	    model.addAttribute("anhDaiDien", "/images/huy.jpg");
	    return "frontEnd/about";
	}
}	
