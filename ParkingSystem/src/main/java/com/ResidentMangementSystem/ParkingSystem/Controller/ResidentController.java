package com.ResidentMangementSystem.ParkingSystem.Controller;

import com.ResidentMangementSystem.ParkingSystem.Entity.Resident;
import com.ResidentMangementSystem.ParkingSystem.Exceptions.ResidentNotFound;
import com.ResidentMangementSystem.ParkingSystem.Services.ResidentServices;
import com.ResidentMangementSystem.ParkingSystem.Servicesimpl.ResidentServicesimpl;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resident")
public class ResidentController
{
    @Autowired
    private ResidentServices services;

    @PostMapping("/create")
    private ResponseEntity<?> createResident(@Valid @RequestBody Resident resident, BindingResult result) throws ResidentNotFound {
        if(result.hasErrors()){
            return ResponseEntity
                    .badRequest()
                    .body(result.getFieldError().getDefaultMessage());
        }
        else if(services.createResident(resident)!=null)
        {
            return ResponseEntity.ok(services.createResident(resident));
        }
        else{
            return ResponseEntity.badRequest().body("Resident not saved");
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllResident()
    {
        return ResponseEntity.ok(services.getAllResident());
    }


    @PostMapping("/getResident")
    public ResponseEntity<?> getResidentByName(@RequestParam String fname,@RequestParam String lname) throws Exception
    {
            return ResponseEntity.ok(services.getAllResidentByName(fname,lname));
    }






}
