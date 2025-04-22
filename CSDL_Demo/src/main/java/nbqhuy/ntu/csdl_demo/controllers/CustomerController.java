package nbqhuy.ntu.csdl_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nbqhuy.ntu.csdl_demo.entities.Customer;
import nbqhuy.ntu.csdl_demo.respositories.CustomerRepository;

@Controller
@RestController
public class CustomerController {
	@Autowired
	CustomerRepository myCustomerRepository;
	
	@GetMapping("customer/all")
	public String getAll(ModelMap m) {
		List<Customer> dsKHs= new ArrayList<Customer>();
		dsKHs = myCustomerRepository.findAll();
		m.addAttribute("dsKH",dsKHs);
		return null;
	}
}
