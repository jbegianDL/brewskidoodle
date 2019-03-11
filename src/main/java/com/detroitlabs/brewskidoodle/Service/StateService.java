package com.detroitlabs.brewskidoodle.Service;

import com.detroitlabs.brewskidoodle.Model.BreweryDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StateService {
    public BreweryDetails fetchAdviceData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.openbrewerydb.org/breweries?by_state=michigan", BreweryDetails.class);
    }
}
