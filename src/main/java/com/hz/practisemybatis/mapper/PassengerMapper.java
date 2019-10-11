package com.hz.practisemybatis.mapper;

import com.hz.practisemybatis.domain.Passenger;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("passengerMapper")
public interface PassengerMapper {
    Passenger getPassengerByPid(Passenger passenger);
    boolean savePassenger(Passenger passenger);
    Passenger login(Passenger passenger);
}
