package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64130854.model.Post;

@Controller
public class PostController {
	ArrayList<Post> list=new ArrayList<Post>();
	public PostController() {
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
	 	list.add(new Post("1", "Home Page", "home, page", "Welcome to the home page."));
       
	}
	
	 @GetMapping("/post/all")
	    public String getPage(ModelMap model) {
	        model.addAttribute("postlist", list);
	        return "post/postlist";
	    }

	    @GetMapping("/post/new")
	    public String addNew(ModelMap model) {
	        return "post/newpost";
	    }
	 
	 @PostMapping("/post/new")
	    public String addPage(
	        @RequestParam String id,
	        @RequestParam String title,
	        @RequestParam String content,
	        @RequestParam String catetoryID,
	        ModelMap model
	    ) {
	        list.add(new Post(id, title, content, catetoryID));
	        model.addAttribute("postlist", list);
	        return "redirect:/post/all";
	    }
	
}
