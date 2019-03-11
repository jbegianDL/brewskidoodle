package com.detroitlabs.brewskidoodle.Controller;

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
        String text = "hello";
        return text;
    }

}
