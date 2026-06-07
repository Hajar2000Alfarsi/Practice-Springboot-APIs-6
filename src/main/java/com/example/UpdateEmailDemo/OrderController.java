package com.example.UpdateEmailDemo;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    private Map<Integer, Order> orderMap =  new HashMap<>();

}
