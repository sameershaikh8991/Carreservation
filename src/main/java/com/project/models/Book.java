package com.project.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "bookingdetails")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  int bookId;

    private  int carId;

    private  int userId;

    private LocalDate startDate;

    private  LocalDate endDate;

    private LocalTime startTime;

    private  LocalTime endTime;

    private  LocalTime duration;

    private String status;




}
