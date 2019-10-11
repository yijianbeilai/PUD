package com.hz.practisemybatis.controller;

import com.hz.practisemybatis.domain.Driver;
import com.hz.practisemybatis.service.DriverService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("driver")
public class DriverController {
    @Resource
    private DriverService driverService;

    @RequestMapping("saveDriver")
    public boolean saveDriver(Driver driver){
        return driverService.saveDriver(driver);
    }

    @RequestMapping("getDriverByDname")
    public Driver getDriverByDname(Driver driver){
        return driverService.getDriverByDname(driver);
    }

    @RequestMapping("getDriverByDid")
    public Driver getDriverByDid(Driver driver){
        return driverService.getDriverByDid(driver);
    }


}
