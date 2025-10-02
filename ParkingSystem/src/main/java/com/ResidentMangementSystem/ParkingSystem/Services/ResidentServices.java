package com.ResidentMangementSystem.ParkingSystem.Services;

import com.ResidentMangementSystem.ParkingSystem.Entity.Resident;
import com.ResidentMangementSystem.ParkingSystem.Exceptions.ResidentNotFound;

import java.util.List;

public interface ResidentServices
{
    Resident createResident(Resident resident) throws ResidentNotFound;
    List<Resident> getAllResident();

    Resident getAllResidentByName(String firstname,String lastname) throws Exception;
}
