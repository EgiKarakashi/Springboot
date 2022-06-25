package com.example.springboot_demo;

import com.example.springboot_demo.entities.Spid;
import com.example.springboot_demo.entities.Status;
import com.example.springboot_demo.entities.Type;
import com.example.springboot_demo.entities.User;
import com.example.springboot_demo.service.SpidService;
import com.example.springboot_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest(classes = {SpringBootDemoApplication.class})
class SpringBootDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private SpidService spidService;

    @Test
    void test() {
        try {
            System.out.println(userService.getUserById(1L));
            User user = userService.updateUser(new User(), 1L);
            System.out.println(userService.getUserById(1L));

            Spid spid = spidService.createSpid(new Spid());
            System.out.println(spidService.findSpidById(user.getId()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
