package com.detroitlabs.brewskidoodle.Controller;

import com.detroitlabs.brewskidoodle.Model.BreweryList;
import com.detroitlabs.brewskidoodle.Service.NameService;
import com.detroitlabs.brewskidoodle.Service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BreweryController {

    @Autowired
    NameService nameService;
    @Autowired
    StateService stateService;

    @RequestMapping("list")
    @ResponseBody
    public String displayBreweryList(){
        BreweryList breweries = stateService.fetchStateData();
        String breweryName = breweries.get(1).getName();
        String listSize = String.valueOf(breweries.size());

        return breweryName + listSize;
    }

}
