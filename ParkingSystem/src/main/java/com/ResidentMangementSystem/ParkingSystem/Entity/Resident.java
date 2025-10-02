package com.ResidentMangementSystem.ParkingSystem.Entity;

import com.ResidentMangementSystem.ParkingSystem.Enums.ResidentType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
public class Resident
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Enter First name")
    @JsonProperty("fName")
   private String fName;

    @JsonProperty("lName")
    private String lName;

   @NotNull(message = "Enter Flat Number")
   @JsonProperty("flatNo")
   private String flatNo;

   @NotNull(message = "Enter Mobile Number")
   @JsonProperty("mobileNo")
   private long mobileNo;

   @NotNull(message = "Enter Email")
   @JsonProperty("email")
   private String email;

   @NotNull(message = "Enter residentType")
   @JsonProperty("residentType")
   private ResidentType residentType;

   @OneToMany(mappedBy = "resident",cascade=CascadeType.ALL)
   @JsonManagedReference
   private List<Vehical> vehicalList;

   @OneToMany(mappedBy = "resident" ,cascade=CascadeType.ALL)
   @JsonManagedReference
   private List<Visitors> visitorList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ResidentType getResidentType() {
        return residentType;
    }

    public void setResidentType(ResidentType residentType) {
        this.residentType = residentType;
    }

    public List<Vehical> getVehicalList() {
        return vehicalList;
    }

    public void setVehicalList(List<Vehical> vehicalList)
    {

        this.vehicalList = vehicalList;
    }

    public List<Visitors> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(List<Visitors> visitorList)
    {
           this.visitorList = visitorList;
    }
}
