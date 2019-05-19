package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.Random;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class main {
	
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) throws IOException{
    	Data data = new Data();
    	RestTemplate restTemplate = new RestTemplate();

    	data.setResponse(restTemplate.getForObject("https://katsuo.herokuapp.com/api?menu", String.class));// すべてのレシピ名を取得
		
    	String json = data.getResponse();
//    	System.out.println(json);
    	
        model.addAttribute("input", data.getFoodList());
        model.addAttribute("test", data.getResponse());
        return "index.html";
    }
 
    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String result(Model model) {
    	Data data = new Data();
    	Random rnd = new Random();
    	
    	List<String> poopList = data.getPoopList();
    	
        model.addAttribute("result", poopList.get(rnd.nextInt(3)));
        return "result.html";
    }
}