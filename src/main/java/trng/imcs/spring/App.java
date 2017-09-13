package trng.imcs.spring;

import java.sql.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import trng.imcs.spring.mvc.model.Department;
import trng.imcs.spring.mvc.model.Employee;
import trng.imcs.spring.mvc.repository.DepartmentRepository;
import trng.imcs.spring.mvc.repository.EmployeeRepository;


@SpringBootApplication
@EnableJpaRepositories
public class App {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		//EmployeeRepository empDAO = context.getBean(EmployeeRepository.class);
		//DepartmentRepository deptDAO = context.getBean(DepartmentRepository.class);
//		List<Employee> empList = Lists.newArrayList(empDAO.findAll());
		
	/*	//for all employees
		System.out.println("................................");
		Iterable<Employee> itr =  empDAO.findAll();
		for (Employee employee : itr) {
			System.out.println(employee);
		}*/
		/*java.util.Date d = new java.util.Date(); 
		Date sqlDate = new Date(d.getTime());
		Employee employee = new Employee(1, "chinna", "nag1", "123", 24, sqlDate,
				 sqlDate, 1, 1234, 1);
		//System.out.println(empDAO.findByDeptId(1));
		empDAO.save(employee);
		//empDAO.delete(3);
*/		
		
		/*Iterable<Department> itr =  deptDAO.findAll();
		for (Department dept : itr) {
			System.out.println(dept);
		}
		*/
		
		//System.out.println(deptDAO.findOne(1));
		
		//System.out.println(deptDAO.delete(4));
		//System.out.println(empDAO.findOne(1));
		java.util.Date d = new java.util.Date(); 
		Date sqlDate = new Date(d.getTime());
		Employee employee = new Employee("nag", "nag", "12345", 25, sqlDate,
				 sqlDate, 1, 1234, 1);
		//System.out.println(empDAO.findByDeptId(1));
		
		//empDAO.save(employee);
		
	}
}
