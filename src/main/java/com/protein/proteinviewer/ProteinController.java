package com.protein.proteinviewer;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
public class ProteinController {

    @GetMapping("/protein/{id}")
    public String getProtein(@PathVariable String id) {

        String url = "https://files.rcsb.org/view/" + id + ".pdb";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, String.class);
    }
}