package org.example.endpoint.publicAPI.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.endpoint.publicAPI.controller.RandomFactsComponent;
import org.example.endpoint.publicAPI.dto.RandomFact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RandomFactsServiceImplTest {

    @Mock
    private RandomFactsComponent randomFactsComponent;

    @InjectMocks
    private RandomFactsServiceImpl randomFactsService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetRandomFact() {
        // Arrange
        RandomFact expectedFact = new RandomFact();
        expectedFact.setText("Sample fact");
        when(randomFactsComponent.getRandomFact()).thenReturn(expectedFact);

        // Act
        RandomFact actualFact = randomFactsService.getRandomFact();

        // Assert
        assertEquals("Sample fact", actualFact.getText());
        verify(randomFactsComponent, times(1)).getRandomFact();
    }

    @Test
    public void testGetRandomFactToday() {
        // Arrange
        RandomFact expectedFact = new RandomFact();
        expectedFact.setText("Today's fact");
        when(randomFactsComponent.getRandomFactToday()).thenReturn(expectedFact);

        // Act
        RandomFact actualFact = randomFactsService.getRandomFactToday();

        // Assert
        assertEquals("Today's fact", actualFact.getText());
        verify(randomFactsComponent, times(1)).getRandomFactToday();
    }
}
