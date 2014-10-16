package de.comline.mpm.config.webapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/settings")
public class BaseSettingsController {
 
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String menu(ModelMap model) {
 
		
 
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "menu";
 
	}
	
	@RequestMapping(value="/language", method = RequestMethod.GET)
	public String langugae(ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - welcome()");
 
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "language";
 
	}
	
	
	@RequestMapping(value="/language/new", method = RequestMethod.POST)
	public String index(ModelMap model) {
 
		
 
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "language";
 
	}
	
 
	
 
}