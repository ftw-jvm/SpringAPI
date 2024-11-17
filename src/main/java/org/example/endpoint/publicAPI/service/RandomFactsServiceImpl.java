package org.example.endpoint.publicAPI.service;

import org.example.endpoint.publicAPI.controller.RandomFactsComponent;
import org.example.endpoint.publicAPI.dto.RandomFact;
import org.springframework.stereotype.Service;


@Service
public class RandomFactsServiceImpl implements RandomFactsService {
    private final RandomFactsComponent randomFactsComponent;

    public RandomFactsServiceImpl(RandomFactsComponent randomFactsComponent) {
        this.randomFactsComponent = randomFactsComponent;
    }

    @Override
    public RandomFact getRandomFact() {
        return randomFactsComponent.getRandomFact();
    }

    @Override
    public RandomFact getRandomFactToday() {
        return randomFactsComponent.getRandomFactToday();
    }
}
