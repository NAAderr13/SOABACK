package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "carClient", url = "https://api.unsplash.com")
public interface CarClient {

    @GetMapping("/search/photos")
    ResponseEntity<Object> searchCarImages(
            @RequestParam("query") String query,
            @RequestParam("client_id") String apiKey // Remplacer par votre clé d'accès Unsplash
    );
}
