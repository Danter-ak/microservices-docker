package com.example.order_service;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

//    @GetMapping("/{orderId}")
//    public String getOrder(@PathVariable String orderId) {
//        // Call User Service
//        String userInfo = new RestTemplate().getForObject("http://user-service:8081/api/users/123", String.class);
//        return "Order " + orderId + " processed for: " + userInfo;
//    }


        @GetMapping("/{id}")
        public String getOrderWithUser(@PathVariable String id) {
            // Appel du user-service depuis le container Docker
            RestTemplate restTemplate = new RestTemplate();
            String userResponse = restTemplate.getForObject("http://user-service:8081/api/users/" + id, String.class);

            return "Commande ID " + id + " pour " + userResponse;
        }

}
