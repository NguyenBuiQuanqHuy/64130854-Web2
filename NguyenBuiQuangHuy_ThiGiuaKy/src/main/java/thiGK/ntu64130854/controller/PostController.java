package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	        model.addAttribute("pagelist", list);
	        return "postlist";
	    }

	    @GetMapping("/post/new")
	    public String addNew(ModelMap model) {
	        return "addPost";
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
	        model.addAttribute("pagelist", list);
	        return "redirect:/post/all";
	    }

	 @GetMapping("/post/delete/{id}")
	    public String deletePage(@PathVariable String id, ModelMap model) {
	        list.removeIf(page -> page.getId().equals(id));
	        return "redirect:/post/all";
	    }

	    @GetMapping("/post/view/{id}")
	    public String viewPage(@PathVariable String id, ModelMap model) {
	        for (Post post : list) {
	            if (post.getId().equals(id)) {
	                model.addAttribute("page", post);
	                return "viewpost";
	            }
	        }
	        return "redirect:/post/all";
	    }
}
