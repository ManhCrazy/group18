package Cnpm.CuaHangTheThao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	@GetMapping("login")
	public String login() {
		return "layout/admin";
	}
	
	@PostMapping("index")
	public String index(){
		return "layout/admin";
	}
}
