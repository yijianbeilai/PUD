package com.hz.practisemybatis.service.impl;

import com.hz.practisemybatis.domain.Passenger;
import com.hz.practisemybatis.mapper.PassengerMapper;
import com.hz.practisemybatis.service.PassengerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {
    @Resource
    private PassengerMapper passengerMapper;

    @Override
    public Passenger getPassengerByPid(Passenger passenger) {
        return passengerMapper.getPassengerByPid(passenger);
    }

    @Override
    public boolean savePassenger(Passenger passenger) {
        return passengerMapper.savePassenger(passenger);
    }

    @Override
    public boolean login(Passenger passenger) {
        Passenger passenger1=passengerMapper.login(passenger);
        if(passenger1!=null)
            return true;
        return false;
    }
}
