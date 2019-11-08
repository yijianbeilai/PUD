package com.hz.practisemybatis.service.impl;

import com.hz.practisemybatis.domain.Car;
import com.hz.practisemybatis.mapper.CarMapper;
import com.hz.practisemybatis.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("carService")
public class CarServiceImpl implements CarService {
    @Resource
    private CarMapper carMapper;

    @Override
    public boolean saveCar(Car car) {
        return carMapper.saveCar(car);
    }

    @Override
    public Car getCarAndDriver(Car car) {
        return carMapper.getCarAndDriver(car);
    }

    @Override
    public boolean saveCarExceptDid(Car car) {
        return carMapper.saveCarExceptDid(car);
    }
}
