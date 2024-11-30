package com.example.demo.service;

import com.example.demo.client.CarClient;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

@Service
public class CarService {

    private final CarClient carClient;

    public CarService(CarClient carClient) {
        this.carClient = carClient;
    }

    public Object searchCarImages(String query, String apiKey) {
        ResponseEntity<Object> response = carClient.searchCarImages(query, apiKey);
        return response.getBody(); // Retourne les résultats de la recherche d'images
    }
}
