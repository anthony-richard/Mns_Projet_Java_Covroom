package Covroom.AnthonyRichard.controllers;

import Covroom.AnthonyRichard.dao.SeatDao;
import Covroom.AnthonyRichard.models.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {

    @Autowired
    SeatDao SeatDao;

    @GetMapping("seat")
    public List<Seat>getSeat(){
        List<Seat> seat = SeatDao.findAll();
        return seat;
    }
}
