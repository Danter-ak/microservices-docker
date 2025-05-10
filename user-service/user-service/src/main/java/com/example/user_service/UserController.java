package com.example.user_service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "Utilisateur ID " + id + "trouvéé !!!";
    }
//@RestController
//@RequestMapping("/api/users")
//public class usercontroller {
//
//    @GetMapping("/{userId}")
//    public String getUserById(@PathVariable String userId) {
//        return "User with ID " + userId + " found!";
//    }
//}

}