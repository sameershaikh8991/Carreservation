package com.project.controllers;


import com.project.models.Location;
import com.project.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/location")
public class LocationController {

    @Autowired
    private LocationService locationService;



    @PostMapping("/addlocation")
    public Location saveLocation(@RequestBody Location location){
        System.out.println("loc controller");
       return locationService.saveLocation(location);
    }
}
