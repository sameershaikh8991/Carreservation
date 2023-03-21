package com.project.controllers;


import com.project.models.Car;
import com.project.services.CarService;
import com.project.services.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/car")
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping("/addcar")
    public Car saveBus(@RequestBody Car car) {
        return service.saveCar(car);
    }
}