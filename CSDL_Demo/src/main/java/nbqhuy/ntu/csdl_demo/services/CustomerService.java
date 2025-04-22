package nbqhuy.ntu.csdl_demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import nbqhuy.ntu.csdl_demo.entities.Customer;
import nbqhuy.ntu.csdl_demo.respositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository myCustomerRepository;
	public List<Customer> allKH()
		{
			return myCustomerRepository.findAll();
		}
}
