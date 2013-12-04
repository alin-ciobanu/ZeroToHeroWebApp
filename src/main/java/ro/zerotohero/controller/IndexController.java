package ro.zerotohero.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.zerotohero.model.RoleEntity;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {

		RoleEntity role1 = new RoleEntity();
		role1.setId("1");
		role1.setName("Role #1");

		RoleEntity role2 = new RoleEntity();
		role2.setId("2");
		role2.setName("Role #2");

		RoleEntity role3 = new RoleEntity();
		role3.setId("3");
		role3.setName("Role #3");

		ArrayList<RoleEntity> roleList = new ArrayList<RoleEntity>();
		roleList.add(role1);
		roleList.add(role2);
		roleList.add(role3);

		model.addAttribute("message", "Application Index");
		model.addAttribute("roleList", roleList);
		return "index";
	}

}
