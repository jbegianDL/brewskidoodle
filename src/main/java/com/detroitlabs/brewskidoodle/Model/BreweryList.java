package com.detroitlabs.brewskidoodle.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BreweryList extends ArrayList<BreweryDetails> {

}
