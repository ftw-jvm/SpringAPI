package org.example.endpoint.publicAPI.controller;

import org.example.endpoint.publicAPI.dto.RandomFact;
import org.example.endpoint.publicAPI.service.RandomFactsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final RandomFactsService randomFactsService;

    public TestController(RandomFactsService randomFactsService) {
        this.randomFactsService = randomFactsService;
    }

    @GetMapping("/facts/random")
    public RandomFact getRandomFact() {
        return randomFactsService.getRandomFact();
    }

    @GetMapping("/facts/today")
    public RandomFact getRandomFactToday() {
        return randomFactsService.getRandomFactToday();
    }
}
