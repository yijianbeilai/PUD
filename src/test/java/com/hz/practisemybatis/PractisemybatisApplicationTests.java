package com.hz.practisemybatis;

import com.hz.practisemybatis.controller.PassengerController;
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
import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PractisemybatisApplicationTests {

    @Resource
    private TicketService ticketService;
    @Resource
    private CarService carService;
    @Resource
    private PassengerService passengerService;
    @Resource
    private DriverService driverService;
    @Test
    public void testTimestamp(){

    }

    @Test
    public void contextLoads() {
        Passenger passenger=new Passenger();
        passenger.setPid("12345");
        passenger=passengerService.getPassengerByPid(passenger);
        System.out.println(passenger.getPname());
    }

    @Test
    public void te1(){
        Driver driver=new Driver();
        driver.setDid("90001");
        driver.setDname("tuohai");
        driverService.saveDriver(driver);
    }

    @Test
    public void te2(){

        System.out.println(driverService.getDriverByDid(new Driver("90001")).getDname());

        System.out.println(driverService.getDriverByDname(new Driver("tuohai",1)).getDid());
    }
    @Test
    public void te3(){
        Driver driver=driverService.getDriverByDid(new Driver("90001"));
        Car car=new Car();
        car.setCid("50001");
        car.setDriver(driver);
        boolean iop=carService.saveCar(car);
        System.out.println(iop);
    }

    @Test
    public void te4(){
        Car car=new Car();
        car.setCid("50001");
        car=carService.getCarAndDriver(car);
        System.out.println(car.getDriver().getDname()+" "+car.getDriver().getDid());
    }
    @Test
    public void te5(){
        Ticket ticket = new Ticket();
        Passenger passenger =new Passenger();
        Car car=new Car();
        passenger.setPid("12345");
        car.setCid("50001");
        passenger=passengerService.getPassengerByPid(passenger);
        car=carService.getCarAndDriver(car);
        ticket.setCar(car);
        ticket.setPassenger(passenger);
        ticket.setTid("333333");
        ticket.setTvalue(10);
        boolean iop=ticketService.saveTicket(ticket);
        System.out.println(iop);
    }
    @Test
    public  void st1(){
        Ticket ticket=new Ticket();
        ticket.setTid("333333");
        ticket=ticketService.getTicket(ticket);
        System.out.println(ticket.getPassenger().getPname()+" "+ticket.getCar().getCid()+" "+ticket.getCar().getDriver().getDname());
    }
}
