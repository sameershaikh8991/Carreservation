package com.project.controllers;


import com.project.models.Car;
import com.project.services.CarService;
import com.project.services.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/car")
public class CarController {

    @Autowired
    private CarService service;

    @Autowired
    ExcelService excelService;

    @PostMapping("/addcar")
    public Car saveBus(@RequestBody Car car) {
        return service.saveCar(car);
    }

    @GetMapping("/all")
    public List<Car> allCar(){
        return  service.getAlL();
    }




}
