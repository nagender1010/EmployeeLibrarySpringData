package trng.imcs.spring.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.model.Employee;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
