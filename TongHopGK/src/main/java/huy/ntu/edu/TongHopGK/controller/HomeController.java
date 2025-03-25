package huy.ntu.edu.TongHopGK.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import huy.ntu.edu.TongHopGK.model.SinhVien;

@Controller
public class HomeController {
	@GetMapping("/")
	public String trangChu() {
		return "frontEnd/index";
	}
	
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
	
	@GetMapping("/list")
	public String getStudent(ModelMap model) {
		ArrayList<SinhVien> dsSinhViens=new ArrayList<SinhVien>();
		dsSinhViens.add(new SinhVien(64130854,"Nguyễn Bùi Quang Huy",9.0f));
		dsSinhViens.add(new SinhVien(64132656,"Đồng Nguyên Quang",8.5f));
		dsSinhViens.add(new SinhVien(64132108,"Miểu Văn Trung",8.75f));
	
		model.addAttribute("students",dsSinhViens);
		return "frontEnd/list";
	}
}
