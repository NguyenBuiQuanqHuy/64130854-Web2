package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64130854.model.Page;

@Controller
public class PageController {
	ArrayList<Page> list=new ArrayList<Page>();
	@GetMapping("/")
	public String trangchu() {
		return "index";
	}
	
	public PageController() {
		// TODO Auto-generated constructor stub
		 list.add(new Page("1", "Home Page", "home, page", "Welcome to the home page.", "0"));
	        list.add(new Page("2", "About Page", "about, page", "Information about the website.", "1"));
	        list.add(new Page("3", "Contact Page", "contact, page", "Get in touch with us.", "1"));
	        list.add(new Page("4", "Services Page", "services, page", "List of services we offer.", "1"));
	        list.add(new Page("5", "Blog Page", "blog, page", "Latest blog posts and articles.", "1"));
	}
	
	 @GetMapping("/page/all")
	    public String getPage(ModelMap model) {
	        model.addAttribute("pagelist", list);
	        return "listpage";
	    }
	 
	 @GetMapping("/page/new")
	    public String addNew(ModelMap model) {
	        return "newpage";
	    }
}
