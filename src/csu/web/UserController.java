package csu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import csu.servise.UserServise;


@Controller("userController")
@RequestMapping("/user.do")
public class UserController {
	
	@Autowired
	@Qualifier("UserServise")
	private UserServise userServise;
	
	@RequestMapping()
	public String req(@RequestParam("uname") String uname){
		System.out.println("UserServise.req()");
		userServise.add(uname);
		return "index";
		
	}

	public UserServise getUserServise() {
		return userServise;
	}

	public void setUserServise(UserServise userServise) {
		this.userServise = userServise;
	}
	
	

}
