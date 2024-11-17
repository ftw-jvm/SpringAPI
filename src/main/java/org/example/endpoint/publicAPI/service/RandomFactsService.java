package org.example.endpoint.publicAPI.service;

import org.example.endpoint.publicAPI.dto.RandomFact;

public interface RandomFactsService {
    RandomFact getRandomFact();
    RandomFact getRandomFactToday();
}
