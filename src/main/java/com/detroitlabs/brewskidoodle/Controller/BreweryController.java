package com.detroitlabs.brewskidoodle.Controller;

import com.detroitlabs.brewskidoodle.Model.BreweryDetails;
import com.detroitlabs.brewskidoodle.Model.BreweryList;
import com.detroitlabs.brewskidoodle.Service.NameService;
import com.detroitlabs.brewskidoodle.Service.StateService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BreweryController {

    @Autowired
    NameService nameService;
    @Autowired
    StateService stateService;

    @RequestMapping("list")
    public String displayBreweryList(@RequestParam("stateName") String stateName, ModelMap modelMap){
        BreweryList breweries = stateService.fetchStateData(stateName);
        modelMap.put("breweries", breweries);

        return "list";
    }

    @RequestMapping("/")
    public String returnHome(){
     return "home";
    }

    @RequestMapping("/details")
    public String returnDetails(@RequestParam("breweryId") int breweryId, ModelMap modelMap){
        BreweryDetails breweryDetails = nameService.fetchNameData(breweryId);
        modelMap.put("breweryDetails", breweryDetails);
        return "details";
    }

}
