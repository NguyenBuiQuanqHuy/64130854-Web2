package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64130854.model.Page;

@Controller
public class PageController {
	ArrayList<Page> list=new ArrayList<Page>();
	@GetMapping("/")
	public String trangchu() {
		return "index";
	}
}
