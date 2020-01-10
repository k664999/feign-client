package com.example.demo;

import com.example.demo.client.BeerClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

private BeerClient beerClient;

    public Controller(BeerClient beerClient) {
        this.beerClient = beerClient;
    }

    @GetMapping(value = "/beerInfo/{beerId}")
    public ResponseEntity<?> getBeer(@PathVariable ("beerId") Long beerId){

        return new ResponseEntity<>(beerClient.getBeer(beerId),HttpStatus.OK);

    }

    @PostMapping(value = "/beerInfo/{beerId}")
    public ResponseEntity<?> postBeer(@PathVariable ("beerId") Long beerId){

        return new ResponseEntity<>(beerClient.getBeer(beerId),HttpStatus.OK);

    }
}
