package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import thiGK.ntu64130854.model.Page;

@Controller
public class HomeController {
	ArrayList<Page> list=new ArrayList<Page>();
	@GetMapping("/")
	public String trangchu() {
		return "index";
	}
	
	public HomeController() {
		 list.add(new Page("1", "Home Page", "home, page", "Welcome to the home page.", "0"));
	        list.add(new Page("2", "About Page", "about, page", "Information about the website.", "1"));
	        list.add(new Page("3", "Contact Page", "contact, page", "Get in touch with us.", "1"));
	        list.add(new Page("4", "Services Page", "services, page", "List of services we offer.", "1"));
	        list.add(new Page("5", "Blog Page", "blog, page", "Latest blog posts and articles.", "1"));
	}
	
	 @GetMapping("/list")
	    public String getPage(ModelMap model) {
	        model.addAttribute("pagelist", list);
	        return "pagelist";
	    }
	 
	 @GetMapping("/viewPage/{id}")
	    public String viewPage(@PathVariable String id, ModelMap model) {
	        Page pageToView = list.stream()
	                .filter(page -> page.getId().equals(id))
	                .findFirst()
	                .orElse(null);
	        
	        if (pageToView != null) {
	            model.addAttribute("page", pageToView);
	            return "frontEnd/view"; 
	        }
	        return "redirect:/list";
	    }

	    @GetMapping("/deletePage/{id}")
	    public String deletePage(@PathVariable String id) {
	        list.removeIf(page -> page.getId().equals(id));
	        return "redirect:/list";
	    }
}
