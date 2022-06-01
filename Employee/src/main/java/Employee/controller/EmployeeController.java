package Employee.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Employee.repository.EmployeeRepository;
import Employee.model.Employee;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	
	
	@Autowired  // injection des dépendances 
	private EmployeeRepository employeeRepository; // pq on utilise private pour un truc interface ? je vais le comprendre un jour :)  
	
	// get employee
	
	@GetMapping("employees")
	public java.util.List<Employee> getAllEmployee(){
		return this.employeeRepository.findAll();
	}
	
	// get employee by id
	@GetMapping("employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable(value="id") Long employeeId) {
		Optional<Employee> employee=employeeRepository.findById(employeeId);
		return employee;	
	}
	// save employee
	@PostMapping("employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeeRepository.save(employee);
	}
		/*	
	// update employee
	@PutMapping("employees/{id}")
	public ResponseEntity<Employee> updateEployee(@PathVariable(value= "id") Long employeeId, @Validated @RequestBody Employee employeeDetails){
		
		Employee employee = employeeRepository.findById(employeeId);
		employee.setEmail(employeeDetails.getEmail());
		employee.setFirstname(employeeDetails.getFirstname());
		employee.setLastname(employeeDetails.getLastname());
		
	}
	
	// delete employee
	
	@DeleteMapping("employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId){
		Employee employee = employeeRepository.findById(employeeId);
		this.employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
	}*/
	
	
	
	

}
