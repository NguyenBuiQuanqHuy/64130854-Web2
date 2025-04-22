package nbqhuy.ntu.csdl_demo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nbqhuy.ntu.csdl_demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
