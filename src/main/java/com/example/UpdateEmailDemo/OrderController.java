package com.example.UpdateEmailDemo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    private Map<Integer, Order> orderMap =  new HashMap<>();

    public OrderController(){
        orderMap.put(1,new Order(101, "Muscat", "Pending"));
    }

    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId,
                              @RequestParam String newAddress,
                              @RequestParam String newStatus){
        if (!orderMap.containsKey(orderId)) {
            return "Order not found";
        }

        Order order = orderMap.get(orderId);

        String oldAddress = order.getShippingAddress();
        String oldStatus = order.getOrderStatus();

        order.setOrderStatus(newStatus);
        order.setShippingAddress(newAddress);

        return "Order Updated Successfully\n" +
                "Order ID: " + orderId + "\n" +
                "Previous Address: " + oldAddress + "\n" +
                "New Address: " + order.getShippingAddress() + "\n" +
                "Previous Status: " + oldStatus + "\n" +
                "New Status: " + order.getOrderStatus();

    }
}
