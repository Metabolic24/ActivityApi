package com.example.demo.api;

import com.example.demo.model.Activity;
import com.example.demo.model.ActivityError;
import com.example.demo.model.ActivityRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080") // Here is expected the URL of the VueJs application
public class AppController {

    List<Activity> activities = Arrays.asList(
            new Activity("Tennis", "recreational", 0.4, 2),
                new Activity("Futsal", "recreational", 0.7, 10),
                new Activity("Concert", "music", 1.0, 1),
                new Activity("Make a cake", "cooking", 0.2, 1),
                new Activity("Toulouse Game Show", "social", 0.8, 1)
        );

    @GetMapping("/activity")
    public List<Activity> getActivities() {
        return activities;
    }

    @GetMapping("/filter")
    public ResponseEntity<?> filterActivities(@RequestParam(required = false) String type, @RequestParam(required = false) Integer participants, @RequestParam(required = false) Double minPrice, @RequestParam(required = false) Double maxPrice) {
        ActivityRequest request = new ActivityRequest(type, participants, minPrice, maxPrice);
        List<Activity> filteredActivities = activities.stream().filter(activity -> filterPredicate(activity, request)).toList();

        if (filteredActivities.isEmpty()) {
            return ResponseEntity.badRequest().body(new ActivityError());
        } else {
            return ResponseEntity.ok().body(filteredActivities);
        }
    }

    public boolean filterPredicate(Activity activity, ActivityRequest request) {
        if (request.getType() != null && !request.getType().isBlank() && !activity.getType().equals(request.getType())) {
            return false;
        }

        if (request.getParticipants() != null && !activity.getParticipants().equals(request.getParticipants())) {
            return false;
        }

        if (request.getMinPrice() != null && activity.getPrice() < request.getMinPrice()) {
            return false;
        }

        if (request.getMaxPrice() != null && activity.getPrice() > request.getMaxPrice()) {
            return false;
        }

        return true;
    }
}
