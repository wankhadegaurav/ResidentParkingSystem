package com.ResidentMangementSystem.ParkingSystem.Respository;

import com.ResidentMangementSystem.ParkingSystem.Entity.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicalRepository extends JpaRepository<Vehical,Integer>
{

}
