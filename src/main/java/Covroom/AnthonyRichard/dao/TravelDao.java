package Covroom.AnthonyRichard.dao;

import Covroom.AnthonyRichard.models.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelDao extends JpaRepository<Travel,Integer> {
}

