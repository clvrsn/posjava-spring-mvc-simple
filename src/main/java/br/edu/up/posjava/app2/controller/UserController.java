package br.edu.up.posjava.app2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.up.posjava.app2.dao.UserDAO;
import br.edu.up.posjava.app2.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newUser(Model model) {

		model.addAttribute("msg", "");
		model.addAttribute("user", new User());

		return "user_new";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@ModelAttribute("user") User user, Model model) {

		System.out.println(user.getName());
		System.out.println(user.getPassword());
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));

		userDAO.save(user);

		model.addAttribute("msg", "Usuário cadastrado com sucesso!");

		return "user_new";

	}

}
