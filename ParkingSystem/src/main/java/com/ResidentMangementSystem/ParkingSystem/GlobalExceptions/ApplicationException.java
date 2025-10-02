package com.ResidentMangementSystem.ParkingSystem.GlobalExceptions;

import com.ResidentMangementSystem.ParkingSystem.Exceptions.ResidentNotFound;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationException
{

    @ExceptionHandler(ResidentNotFound.class)
    public ResponseEntity<?> ResidentNotfound(ResidentNotFound residentNotFound)
    {

       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(residentNotFound.getMessage());
    }


}
