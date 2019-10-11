package com.hz.practisemybatis.controller;

import com.hz.practisemybatis.domain.Car;
import com.hz.practisemybatis.domain.Driver;
import com.hz.practisemybatis.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("car")
public class CarConroller {
    @Resource
    private CarService carService;
    @RequestMapping("saveCar")
    public boolean saveCar(Car car){
        return carService.saveCar(car);
    }

    @RequestMapping("getCarAndDriver")
    public Car getCarAndDriver(Car car){
        return carService.getCarAndDriver(car);
    }

    @RequestMapping("getCar")
    public void getCar(Car car, Driver driver){
        System.out.println(car);
    }
}
