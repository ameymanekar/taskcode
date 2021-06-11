package com.example.demo.Controller;

import java.io.IOException;

import java.util.List;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.StudyMaterialModel;

import com.example.demo.Service.StudyMaterialService;

@RestController

@RequestMapping("admin")
public class AdminController {

	@Autowired
	StudyMaterialService StudyMaterialService;

	@GetMapping("/home")
	public ModelAndView loginpage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("AdminPanel");
		return mav;
	}

	@GetMapping("login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	@GetMapping("register")
	public ModelAndView reg() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reg");
		return mav;
	}

	@PostMapping("upload")
	public ModelAndView uploaddata(StudyMaterialModel StudyMaterialModel, Map map) throws IOException

	{
		boolean b = StudyMaterialService.isRegister55(StudyMaterialModel);
		map.put("msg", "Record Save Success...........");
		ModelAndView mav = new ModelAndView();

		mav.setViewName("login");
		return mav;
	}

	@PostMapping("checklogin")
	public ModelAndView checklogin(StudyMaterialModel StudyMaterialModel, Map map) throws IOException

	{
		ModelAndView mav = new ModelAndView();

		List<StudyMaterialModel> list = StudyMaterialService.getAllRecords99(StudyMaterialModel);

		for (StudyMaterialModel fruit : list) {
			System.out.println(fruit.getRadio());
			String amey = fruit.getRadio();

			switch (amey) {

			case "Author":
				System.out.println("Tuesday");
				mav.setViewName("amu");
				break;

			case "Reader":
				System.out.println("Monday");
				mav.setViewName("AdminPanel");
				break;
			case "Publishers":
				System.out.println("Tuesday");
				mav.setViewName("amey");
				break;
			}
		}
		return mav;
	}

}
