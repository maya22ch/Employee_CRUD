package Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Employee.model.Employee;
import Employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		
	}
	
	/* pour créer la base de donnée 
	 * 1) sqlshel --> create database Employee; --> redémarrer la sqlshel
	 * --> se positionner sur la base de donnée en entrant le nom de la base de donnée
	 * c tt 
	 * 2) exécuter l appli spring boot starter avec le fichier app.properties ...
	 */

}
