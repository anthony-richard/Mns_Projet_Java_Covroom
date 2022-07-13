package Covroom.AnthonyRichard.controllers;

import Covroom.AnthonyRichard.dao.TravelDao;
import Covroom.AnthonyRichard.models.Travel;
import Covroom.AnthonyRichard.models.TravelPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TravelController {

    @Autowired
    TravelDao TravelDao;

    @GetMapping("/travel")
    public List<Travel> getAllTravel(){
        List<Travel> travel = TravelDao.findAll();
        return travel;
    }
    @GetMapping("/travel/{id}")
    public ResponseEntity<Travel> getTravel(@PathVariable int id){
        Optional<Travel> travel = TravelDao.findById(id);
        if(travel.isPresent()){
            return ResponseEntity.ok(travel.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/travelCreate")
    public ResponseEntity<Travel> createTravel(@RequestBody Travel travel){
        TravelDao.save(travel);

        return ResponseEntity.status(HttpStatus.CREATED).body(travel);
    }

    @DeleteMapping("/travel/{id}")
    public ResponseEntity<Travel> deleteTravel(@PathVariable int id){
        Optional<Travel> travelDelete = TravelDao.findById(id);
        if (travelDelete.isPresent()){
            TravelDao.deleteById(id);
            return ResponseEntity.ok(travelDelete.get());
        }
        return ResponseEntity.notFound().build();
    }
}
