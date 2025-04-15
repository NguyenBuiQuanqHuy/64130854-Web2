package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	        return "page/listpage";
	    }
	 
	 //Danh sách
	 @GetMapping("/page/new")
	    public String addNew(ModelMap model) {
	        return "page/newpage";
	    }
	 
	@PostMapping("/page/new")
	public String addPage(
	        @RequestParam("id") String id,
	        @RequestParam("pageName") String pageName,
	        @RequestParam("keyword") String keyword,
	        @RequestParam("content") String content,
	        @RequestParam("parentPageID") String parentPageID,
	        ModelMap model
	    ) {
	        list.add(new Page(id, pageName, keyword, content, parentPageID));
	        model.addAttribute("pagelist", list);
	        return "redirect:/page/all";
	    }
	
	// Xem theo ID
	@GetMapping("/page/view/id")
	public String view(@RequestParam("id") String id, ModelMap model) {
		for (Page page:list) {
			if(page.getId().equals(id)) {
				model.addAttribute("page",page);
				return "page/viewpage";
			}
		}
		return "redirect:/page/all";
	}
	
	// Xóa theo ID
	@GetMapping("/page/delete/{id}")
    public String deletePage(@PathVariable String id, ModelMap model) {
        list.removeIf(page -> page.getId().equals(id));
        return "redirect:/page/all";
    }
}
