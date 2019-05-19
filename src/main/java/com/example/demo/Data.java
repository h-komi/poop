package com.example.demo;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Data {
    @Getter
    private List<String> foodList = Arrays.asList(
    		"Apple",
    		"Orange",
    		"Melon"
    );
    
    @Getter
    private List<String> poopList = Arrays.asList(
    		"Aaaのうんこ",
    		"Bbbのうんこ",
    		"Cccのうんこ"
    );
    
    @Getter @Setter
    private String response;
    
}

