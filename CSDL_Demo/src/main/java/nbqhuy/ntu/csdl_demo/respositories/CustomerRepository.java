package nbqhuy.ntu.csdl_demo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nbqhuy.ntu.csdl_demo.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
