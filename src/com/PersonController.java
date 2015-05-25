package com;



import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/person")
public class PersonController {
	   Logger logger =Logger.getAnonymousLogger();

	    @RequestMapping(method = RequestMethod.GET)
	    public String setupForm(ModelMap model) {
	        model.addAttribute("person", new Person());
	        return "details.jsp";
	    }

	    @RequestMapping(method = RequestMethod.POST)
	    public String processForm(@ModelAttribute("person") Person person) {
	        logger.info(person.getId()+"");
	        logger.info(person.getName());
	        logger.info(person.getSurname());
	        return "success.jsp";
	   }
}
