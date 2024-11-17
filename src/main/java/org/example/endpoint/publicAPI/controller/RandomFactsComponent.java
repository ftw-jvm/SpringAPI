package org.example.endpoint.publicAPI.controller;


import org.example.endpoint.publicAPI.dto.RandomFact;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RandomFactsComponent {
    private final RestTemplate restTemplate;

    public RandomFactsComponent(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RandomFact getRandomFact() {
        String apiUrl = "https://uselessfacts.jsph.pl/api/v2/facts/random";
        return restTemplate.getForObject(apiUrl, RandomFact.class);
    }

    public RandomFact getRandomFactToday() {
        String apiUrl = "https://uselessfacts.jsph.pl/api/v2/facts/today";
        return restTemplate.getForObject(apiUrl, RandomFact.class);
    }
}
