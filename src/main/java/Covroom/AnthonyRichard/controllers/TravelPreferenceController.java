package Covroom.AnthonyRichard.controllers;

import Covroom.AnthonyRichard.dao.TravelPreferenceDao;
import Covroom.AnthonyRichard.models.Travel;
import Covroom.AnthonyRichard.models.TravelPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelPreferenceController {

    @Autowired
    TravelPreferenceDao TravelPreferenceDao;

    @GetMapping("/travelPreference")
    public List<TravelPreference> getTravelPreference(){
        List<TravelPreference> travelPreferences = TravelPreferenceDao.findAll();
        return travelPreferences;
    }
}
