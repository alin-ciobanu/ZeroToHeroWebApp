package ro.zerotohero.controller.admin;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.AdminEntity;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {

		AdminEntity admin1 = new AdminEntity();
		admin1.setFirstName("Ion");
		admin1.setLastName("Ionescu");
		admin1.setEmail("ion.ionescu@mail.ro");
		admin1.setPassword("password");

		AdminEntity admin2 = new AdminEntity();
		admin2.setFirstName("Vasile");
		admin2.setLastName("Vasilescu");
		admin2.setEmail("vv@mail.ro");
		admin2.setPassword("password");

		AdminEntity admin3 = new AdminEntity();
		admin3.setFirstName("George");
		admin3.setLastName("Georgescu");
		admin3.setEmail("gg@mail.ro");
		admin3.setPassword("password");

		ArrayList<AdminEntity> listaAdmin = new ArrayList<AdminEntity>();
		listaAdmin.add(admin1);
		listaAdmin.add(admin2);
		listaAdmin.add(admin3);

		model.addAttribute("message", "Application Index");
		return "admin/index";
	}

}
