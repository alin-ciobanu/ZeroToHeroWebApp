package ro.zerotohero.controller.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.Employee;
import ro.zerotohero.service.EmployeeService;
import ro.zerotohero.service.RoleService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
	public String listEmployee(ModelMap model) {
		List<Employee> employeeList = employeeService.findAll();
		model.addAttribute("employeeList", employeeList);
		return "employee/listEmployee";
	}

}
