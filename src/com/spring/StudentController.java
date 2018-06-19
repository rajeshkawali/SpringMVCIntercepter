package com.spring;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		System.out.println("----initBinder----");
		
		//if you dont want to include sMobile in Student pojo class then use it
		//binder.setDisallowedFields(new String[] {"sMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(dateFormat, false));
		
	}
	
	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		System.out.println("----getAdmissionForm----");
		ModelAndView mav = new ModelAndView("admissionForm");
		return mav;
	}

	@RequestMapping(value = "/admissionFormSubmit", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView mav = new ModelAndView("admissionForm");
			return mav;
		}
		System.out.println("----submitAdmissionForm----");
		ModelAndView mav = new ModelAndView("admissionFormSubmit");
		return mav;
	}

	@ModelAttribute
	public void addingCommonObject(Model mav) {
		
		System.out.println("----addingCommonObject----");
		mav.addAttribute("defaultMessage", "Welcome to Spring");
	}

}
