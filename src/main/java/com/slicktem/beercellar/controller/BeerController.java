package com.slicktem.beercellar.controller;

import com.slicktem.beercellar.domain.Beer;
import com.slicktem.beercellar.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/beers")
    public ResponseEntity<List<Beer>> getBeers() {
        return null;
    }

    @GetMapping("/beers/{id}")
    public ResponseEntity<Beer> getBeerById(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/beers")
    public ResponseEntity<Beer> saveBeer(@RequestBody Beer beer) {
        return null;
    }

    @PostMapping("/beers/{id}/comments")
    public ResponseEntity<Beer> addComment(@PathVariable Long id, @RequestBody String beerComment) {
        return null;
    }

    @DeleteMapping("/beers/{id}")
    public ResponseEntity<Beer> delete(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/beers/{beerId}/comments/{commentId}")
    public ResponseEntity<Beer> delete(@PathVariable Long beerId, @PathVariable Long commentId) {
        return null;
    }
}
