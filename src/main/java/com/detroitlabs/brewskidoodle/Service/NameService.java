package com.detroitlabs.brewskidoodle.Service;

import com.detroitlabs.brewskidoodle.Model.BreweryDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NameService {
    public BreweryDetails fetchAdviceData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.openbrewerydb.org/breweries?by_name=Arcadia Brewing Co", BreweryDetails.class);
    }
}
