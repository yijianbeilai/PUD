package com.hz.practisemybatis;

import com.hz.practisemybatis.domain.Car;
import com.hz.practisemybatis.domain.Driver;
import com.hz.practisemybatis.domain.Passenger;
import com.hz.practisemybatis.domain.Ticket;
import com.hz.practisemybatis.service.CarService;
import com.hz.practisemybatis.service.DriverService;
import com.hz.practisemybatis.service.PassengerService;
import com.hz.practisemybatis.service.TicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestP {
    @Resource
    private PassengerService passengerService;
    @Resource
    private DriverService driverService;
    @Resource
    private CarService carService;
    @Resource
    private TicketService ticketService;
    @Test
    public void login(){
        Passenger passenger=new Passenger();
        passenger.setPid("12222");
        passenger.setPname("ls");
        boolean isExists=passengerService.login(passenger);
        putMsg(isExists+"");
    }
    @Test
    public void saveTicket(){
        Car car=new Car();
        car.setCid("50002");
        car=carService.getCarAndDriver(car);
        Passenger passenger=new Passenger();
        passenger.setPid("12222");
        passenger=passengerService.getPassengerByPid(passenger);
        Ticket ticket=new Ticket();
        ticket.setPassenger(passenger);
        ticket.setCar(car);
        ticket.setTid("333334");
        ticket.setTvalue(20);
        ticket.setDestination("黄山");
        ticket.setStation("金陵");
        Date date=new Date();
        Timestamp ts=new Timestamp(date.getTime());
        ticket.setStartTime(ts);
        ts=new Timestamp(ts.getTime()+10*60*60*1000);
        ticket.setEndTime(ts);
        ticketService.saveTicket(ticket);
    }
    @Test
    public void saveCar(){
        Driver driver=new Driver();
        driver.setDid("90002");
        driverService.getDriverByDid(driver);
        Car car=new Car();
        car.setCid("50002");
        car.setDriver(driver);
        carService.saveCar(car);
    }
    @Test
    public void saveDriver(){
        Driver driver=new Driver();
        driver.setDname("daixiahu");
        driver.setDid("90002");
        driverService.saveDriver(driver);
    }
    @Test
    public void savePassenger(){
        Passenger passenger=new Passenger();
        passenger.setPid("12222");
        passenger.setPname("ls");
        passenger.setPsex("男");
        passengerService.savePassenger(passenger);
        putMsg(passengerService.getPassengerByPid(passenger).getPname());
    }
    public void putMsg(String str){
        System.out.println(str);
    }
}
