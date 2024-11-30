package com.example.demo.controller;

import com.example.demo.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    // Endpoint pour rechercher des images de voitures
    @GetMapping("/api/cars")
    public Object searchCars(@RequestParam String query) {
        String apiKey = "TLZlQnhwFPSCYvPjgiarQNnAtzSTWQJQ6qYnhZE0IHA";  // Remplacez par votre clé API Unsplash
        return carService.searchCarImages(query, apiKey);
    }
}
