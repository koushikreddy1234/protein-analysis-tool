package com.protein.proteinviewer;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
public class ProteinController {

    @GetMapping(value = "/protein/{id}", produces = "text/plain")
    public String getProtein(@PathVariable String id) {

        String url = "https://files.rcsb.org/view/" + id.toUpperCase() + ".pdb";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}