package com.ResidentMangementSystem.ParkingSystem.Respository;

import com.ResidentMangementSystem.ParkingSystem.Entity.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitors,Integer>
{

}
