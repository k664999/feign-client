package com.example.demo.client;

//import com.example.demo.consumer.domain.BeerDto;
import com.example.demo.domain.BeerDto;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "apiClient", url = "http://localhost:8080/")
public interface BeerClient {

    @GetMapping(path = "api/v1/beer/{beerId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    BeerDto getBeer(@PathVariable("beerId") Long beerId);

    @GetMapping(path = "api/v1/beer/beersToQueue", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    BeerDto publishBeers(@PathVariable("beerId") Long beerId);
}
