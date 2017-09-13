package trng.imcs.spring.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import trng.imcs.spring.mvc.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByDeptId(int deptId);

}
