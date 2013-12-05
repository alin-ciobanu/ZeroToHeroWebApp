package ro.zerotohero.controller.admin;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {

		Admin admin1 = new Admin();
		admin1.setFirstName("Ion");
		admin1.setLastName("Ionescu");
		admin1.setEmail("ion.ionescu@mail.ro");
		admin1.setPassword("password");

		Admin admin2 = new Admin();
		admin2.setFirstName("Vasile");
		admin2.setLastName("Vasilescu");
		admin2.setEmail("vv@mail.ro");
		admin2.setPassword("password");

		Admin admin3 = new Admin();
		admin3.setFirstName("George");
		admin3.setLastName("Georgescu");
		admin3.setEmail("gg@mail.ro");
		admin3.setPassword("password");

		ArrayList<Admin> adminList = new ArrayList<Admin>();
		adminList.add(admin1);
		adminList.add(admin2);
		adminList.add(admin3);

		model.addAttribute("message", "Admin Index");
		model.addAttribute("adminList", adminList);
		return "admin/index";
	}

}
