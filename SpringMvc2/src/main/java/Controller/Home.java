package Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;  
public class Home {
	@Controller
	public class HomeController {  
		 @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
		    public String index(Model model) {
			 return "index";
		 }
}
}