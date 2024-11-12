package com.example.demo.api;

import com.example.demo.model.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AppController {
    @GetMapping("/activity")
    public List<Activity> getActivities() {
        return Arrays.asList(
                new Activity("Tennis", "recreational", 0.4, 2),
                new Activity("Futsal", "recreational", 0.7, 10),
                new Activity("Concert", "music", 1.0, 1),
                new Activity("Make a cake", "cooking", 0.2, 1),
                new Activity("Toulouse Game Show", "social", 0.8, 1)
        );
    }
}
