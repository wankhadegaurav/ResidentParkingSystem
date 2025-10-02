package com.ResidentMangementSystem.ParkingSystem.Respository;

import com.ResidentMangementSystem.ParkingSystem.Entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResidentRepository extends JpaRepository<Resident,Integer>
{

   Optional<Resident> findByFNameOrLName(String fname, String lname) ;

}
