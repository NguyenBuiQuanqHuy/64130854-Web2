package huy.ntu.edu.TruyenDLSangView;

import java.lang.ProcessHandle.Info;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DuLieuController {
	@GetMapping("/profile")
	public String thongtinSV(ModelMap model) {
		 model.addAttribute("mssv", "64130854");
	        model.addAttribute("hoTen", "Nguyễn Bùi Quang Huy");
	        model.addAttribute("namSinh", 2004);
	        model.addAttribute("gioiTinh", "Nam");
	        return "profile";
	}
}
