package com.hz.practisemybatis.service;

import com.hz.practisemybatis.domain.Driver;

public interface DriverService {
    boolean saveDriver(Driver driver);
    Driver getDriverByDname(Driver driver);
    Driver getDriverByDid(Driver driver);
}
