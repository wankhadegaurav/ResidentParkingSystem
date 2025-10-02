package com.ResidentMangementSystem.ParkingSystem.Entity;

import com.ResidentMangementSystem.ParkingSystem.Enums.VisitorType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
public class Visitors
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String visitorName;

    private String vehicleName;

    private String vehicalRegiserationNumber;

    private String visitPurpose;

    private LocalDateTime timeIn;

    private LocalDateTime timeOut;

    private long phoneNumber;

    private boolean isActiveVisitor;

    private VisitorType visitorType;

    @ManyToOne
    @JoinColumn(name="resident_id")
    @JsonBackReference
    private Resident resident;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicalRegiserationNumber() {
        return vehicalRegiserationNumber;
    }

    public void setVehicalRegiserationNumber(String vehicalRegiserationNumber) {
        this.vehicalRegiserationNumber = vehicalRegiserationNumber;
    }

    public String getVisitPurpose() {
        return visitPurpose;
    }

    public void setVisitPurpose(String visitPurpose) {
        this.visitPurpose = visitPurpose;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActiveVisitor() {
        return isActiveVisitor;
    }

    public void setActiveVisitor(boolean activeVisitor) {
        isActiveVisitor = activeVisitor;
    }

    public VisitorType getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(VisitorType visitorType) {
        this.visitorType = visitorType;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }
}
