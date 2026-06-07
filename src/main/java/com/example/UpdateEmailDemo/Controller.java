package com.example.UpdateEmailDemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    private Map<Integer, Product> productMap = new HashMap<>();

    public Controller() {
        productMap.put(101, new Product(101, "Laptop", 10));
    }

    @PutMapping("/updateStock/{id}")
    public String UpdateStock(@PathVariable int id, @RequestParam int newStock){


        if (!productMap.containsKey(id)) {
            return "Product not found";
        }

        Product product = productMap.get(id);

        int previousStock = product.getStockQuantity();

        product.setStockQuantity(newStock);

        return "Product Updated Successfully\n" +
                "Product Name: " + product.getName() + "\n" +
                "Previous Stock: " + previousStock + "\n" +
                "Updated Stock: " + product.getStockQuantity();
    }


}
