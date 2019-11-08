package com.hz.practisemybatis;

import com.hz.practisemybatis.domain.Car;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class saveTest {
    @Resource
    private CarService carService;
    @Resource
    private DriverService driverService;
    @Resource
    private TicketService ticketService;
    @Resource
    private PassengerService passengerService;
    @Test
    public void saveCar(){
        Car car = new Car();
        car.setCid("02030001");
        car.setMaxSeat(20);
        car.setNowSeat(20);
        carService.saveCarExceptDid(car);
    }

    @Test
    public void savePassenger(){
        Passenger passenger = new Passenger();
        int num=100000;
        String str="qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<100;i++){
            StringBuilder name = new StringBuilder();
            for(int j=0;j<6;j++){
                int index=(int)(Math.random()*26);
                Character c=str.charAt(index);
                if(j==0)
                    c=Character.toUpperCase(c);
                name.append(c);
                System.out.println(name.toString());
            }
            String pname=name.toString();
            String pid=(num+i)+"";
            passenger.setPid(pid);
            passenger.setPsex("man");
            passenger.setPname(pname);
            passengerService.savePassenger(passenger);
        }
    }
    @Test
    public void saveTicket() throws ParseException {
        List<Ticket> list=new ArrayList();
        Car car=new Car();
        String cid="04030001";
        car.setCid(cid);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse("2019-11-10 00:00:00");
        Timestamp ts=new Timestamp(date.getTime());
        Timestamp end=new Timestamp(date.getTime()+8*60*60*1000);
        for(int i=0;i<20;i++){
            Ticket ticket=new Ticket();
            String tid=cid;
            if(i<10){
                tid=tid+"0";
            }
            tid=tid+i;
            ticket.setCar(car);
            ticket.setStation("广州");
            ticket.setDestination("杭州");
            ticket.setStartTime(ts);
            ticket.setEndTime(end);
            ticket.setTvalue(100);
            ticket.setTid(tid);
            list.add(ticket);
        }
        ticketService.addTicketList(list);
        System.out.println();
    }

}
