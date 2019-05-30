package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SelectForm;
import com.example.demo.model.Food;
import com.example.demo.model.Poop;
import com.example.demo.service.PoopService;

@Controller
public class webController {

	@Autowired
	PoopService service;

	@ModelAttribute
	SelectForm setForm () {
		return new SelectForm();
	}

	@GetMapping("/")
	public String index (Model model) {
		List<Food> foodList = service.getFoodList();
		model.addAttribute("foodList", foodList);
		return "index.html";
	}

	@PostMapping("/result")
	public String result(Model model, @ModelAttribute SelectForm selectForm) {

		List<Poop> poopList = new ArrayList<Poop>();
		poopList.add(new Poop("Aaaうんち"));
		poopList.add(new Poop("Bbbうんち"));
		poopList.add(new Poop("Cccうんち"));

		Random rnd = new Random();

		model.addAttribute("result", poopList.get(rnd.nextInt(3)));
		return "result.html";
	}
}
