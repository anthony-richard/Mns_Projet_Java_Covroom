package Covroom.AnthonyRichard.dao;

import Covroom.AnthonyRichard.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatDao extends JpaRepository<Seat,Integer> {
}
