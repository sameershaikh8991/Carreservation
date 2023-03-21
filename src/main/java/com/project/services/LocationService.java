package com.project.services;

import com.project.models.Location;
import com.project.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Autowired
    private  LocationRepository locationRepository;

    public Location saveLocation(Location location){
        Location location1 = new Location();
        location1.setLocationName(location1.getLocationName());

        System.out.println("save location");
        return  locationRepository.save(location);
    }

}
