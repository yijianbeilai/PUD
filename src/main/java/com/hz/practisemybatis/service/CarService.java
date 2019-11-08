package com.hz.practisemybatis.service;

import com.hz.practisemybatis.domain.Car;

public interface CarService {
    boolean saveCar(Car car);
    Car getCarAndDriver(Car car);
    boolean saveCarExceptDid(Car car);
}
