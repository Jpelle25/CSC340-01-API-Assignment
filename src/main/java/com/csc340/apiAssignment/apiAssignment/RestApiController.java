package com.csc340.apiAssignment.apiAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestApiController {
    @GetMapping("/Definition")
    public Object getDefinition(){

        // API URL: https://api.dictionaryapi.dev/api/v2/entries/en/<word>
        String url = "https://api.dictionaryapi.dev/api/v2/entries/en/computer";
        RestTemplate restTemplate = new RestTemplate();
        Object jSonQuote = restTemplate.getForObject(url, Object.class);
        return jSonQuote;
    }
}
