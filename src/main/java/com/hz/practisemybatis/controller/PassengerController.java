package com.hz.practisemybatis.controller;

import com.hz.practisemybatis.domain.Passenger;
import com.hz.practisemybatis.service.PassengerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("passenger")
public class PassengerController {
    @Resource
    private PassengerService passengerService;
    @RequestMapping("getPassengerByPid")
    public Passenger getPassengerBYPid(Passenger passenger){
        return passengerService.getPassengerByPid(passenger);
    }

    @RequestMapping("login")
    public boolean login(Passenger passenger, HttpServletRequest request){
        boolean isExists = passengerService.login(passenger);
        if(isExists){
            request.getSession().setAttribute("passenger",passengerService.getPassengerByPid(passenger));
        }
        return isExists;
    }
    @RequestMapping("welcom")
    public Passenger welcom(HttpServletRequest request){
        return (Passenger)request.getSession().getAttribute("passenger");
    }

}
