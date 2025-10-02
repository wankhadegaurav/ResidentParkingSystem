package com.ResidentMangementSystem.ParkingSystem.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Vehical
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Enter Registeration Number")
    @JsonProperty("registerationNumber")
    private String registerationNumber;

    @NotNull(message = "Vehical Name")
    @JsonProperty("vName")
    private String vName;

    private String color;


    @JsonProperty("associationDeactivatedAt")
    @CreationTimestamp
    private LocalDateTime associationActivatedAt;

    @JsonProperty("associationDeactivedAt")
    @CreationTimestamp
    private LocalDateTime associationDeactivatedAt;

    @JsonProperty("isVehicalActive")
    private boolean isVehicalActive;

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

    public String getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getAssociationActivatedAt() {
        return associationActivatedAt;
    }

    public void setAssociationActivatedAt(LocalDateTime associationActivatedAt) {
        this.associationActivatedAt = associationActivatedAt;
    }

    public LocalDateTime getAssociationDeactivatedAt() {
        return associationDeactivatedAt;
    }

    public void setAssociationDeactivatedAt(LocalDateTime associationDeactivatedAt) {
        this.associationDeactivatedAt = associationDeactivatedAt;
    }

    public boolean isVehicalActive() {
        return isVehicalActive;
    }

    public void setVehicalActive(boolean vehicalActive) {
        isVehicalActive = vehicalActive;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }
}
