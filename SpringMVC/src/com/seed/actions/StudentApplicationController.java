package com.seed.actions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StudentApplicationController {

	@RequestMapping(method = RequestMethod.GET)
	public String showStudentForm(ModelMap modelMap) {
		return "getStudentInformation";

	}

	@RequestMapping(value = "/studentFormAction", method = RequestMethod.GET)
	public String getStudentdata(HttpServletRequest request, ModelMap modelMap) {

		String string = request.getParameter("studentName");
		modelMap.addAttribute("greeting", "Hello, " + string
				+ " from spring framework 4 MVC");

		return "welcome";

	}
}
