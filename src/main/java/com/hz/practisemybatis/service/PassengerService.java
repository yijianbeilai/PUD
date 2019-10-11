package com.hz.practisemybatis.service;

import com.hz.practisemybatis.domain.Passenger;

public interface PassengerService {
    Passenger getPassengerByPid(Passenger passenger);
    boolean savePassenger(Passenger passenger);
    boolean login(Passenger passenger);
}
