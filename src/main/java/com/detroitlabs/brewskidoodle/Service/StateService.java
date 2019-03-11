package com.detroitlabs.brewskidoodle.Service;

import com.detroitlabs.brewskidoodle.Model.BreweryList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StateService {
    public BreweryList fetchStateData(){
        System.setProperty("http.agent", "state");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.openbrewerydb.org/breweries?by_state=michigan", BreweryList.class);
    }
}
