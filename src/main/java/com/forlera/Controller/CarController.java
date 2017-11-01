package com.forlera.Controller;

import com.forlera.Entity.Car;
import com.forlera.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by OLEX on 01.11.2017.
 */

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Car> getAllCars(){
        return carService.getAllCars();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Car getCarById(@PathVariable("id") int id ){
        return  carService.getCarById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void removeCarById(@PathVariable("id") int id){
        carService.removeCarById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCar(@RequestBody Car car){
        carService.updateCar(car);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCar(@RequestBody Car car ){
        carService.insertCar(car);
    }
}

