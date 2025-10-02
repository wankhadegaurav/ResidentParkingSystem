package com.ResidentMangementSystem.ParkingSystem.Servicesimpl;

import com.ResidentMangementSystem.ParkingSystem.Entity.Resident;
import com.ResidentMangementSystem.ParkingSystem.Entity.Vehical;
import com.ResidentMangementSystem.ParkingSystem.Entity.Visitors;
import com.ResidentMangementSystem.ParkingSystem.Exceptions.ResidentNotFound;
import com.ResidentMangementSystem.ParkingSystem.Respository.ResidentRepository;
import com.ResidentMangementSystem.ParkingSystem.Respository.VehicalRepository;
import com.ResidentMangementSystem.ParkingSystem.Respository.VisitorRepository;
import com.ResidentMangementSystem.ParkingSystem.Services.ResidentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ResidentServicesimpl implements ResidentServices
{
    @Autowired
   private ResidentRepository residentRepository;

    @Autowired
    private VisitorRepository visitorRepository;

    @Autowired
    private VehicalRepository vehicalRepository;

    @Override
    public Resident createResident(Resident resident) throws ResidentNotFound {
        if(resident!=null)
        {
             residentRepository.save(resident);
             List<Vehical> vehicalList=resident.getVehicalList();
             for(Vehical v:vehicalList)
             {
                 vehicalRepository.save(v);
             }
            return  resident;
        }
        throw new  ResidentNotFound("Resident Not Saved");
    }

    @Override
    public List<Resident> getAllResident()
    {
         return residentRepository.findAll();
    }

    @Override
    public Resident getAllResidentByName(String firstname, String lastname) throws Exception {

         Resident resident=residentRepository.findByFNameOrLName(firstname,lastname)
                 .orElseThrow(()-> new ResidentNotFound("Resident Not found"));
         return resident;
    }


}
