package com.example.demo.service;

import com.fasterxml.jackson.databind.JsonNode;

import entity.Food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PoopService {

    /**
     * APIで食べ物のリストを取得する.
     * @return 食べ物リスト
     */
    public List<Food> getFoodList() {
        List<Food> foodList = new ArrayList<Food>();
        RestTemplate restTemplate = new RestTemplate();
        JsonNode foodJsonList = restTemplate.getForObject(
                "https://katsuo.herokuapp.com/api?menu", JsonNode.class);
        for (int i = 0; i < foodJsonList.size(); i += 40) {
            Food food = new Food();
            String foodName =  foodJsonList.get(i).asText();
            System.out.println(foodName);

            food.setName(foodName);
            foodList.add(food);
        }
        return foodList;
    }
}
