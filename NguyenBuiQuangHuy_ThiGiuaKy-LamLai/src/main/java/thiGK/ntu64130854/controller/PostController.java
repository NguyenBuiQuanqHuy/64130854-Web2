package thiGK.ntu64130854.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64130854.model.Post;

@Controller
public class PostController {
	ArrayList<Post> list=new ArrayList<Post>();
	@GetMapping("/")
	public String trangchu() {
		return "index";
	}
	
	
}
