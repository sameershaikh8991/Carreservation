package com.project.services;

import com.project.models.Car;

import java.util.List;

public interface CarService {

    Car saveCar(Car car);

    List<Car> getAlL();
}
