package com.detroitlabs.brewskidoodle.Service;

import com.detroitlabs.brewskidoodle.Model.BreweryDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NameService {
    public BreweryDetails fetchNameData(int breweryId){
        System.setProperty("http.agent", "name");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.openbrewerydb.org/breweries/" + breweryId, BreweryDetails.class);
    }
}
