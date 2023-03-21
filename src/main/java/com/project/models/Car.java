package com.project.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    // car name
    private  String carName;
    
    // car number 
    private  String carNumber;
    
    // car total seats
    private int totalSeats;

    private String availableForBooking;

    private  String fuleType;
}
