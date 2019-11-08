package com.hz.practisemybatis.mapper;

import com.hz.practisemybatis.domain.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("carMapper")
public interface CarMapper {
    boolean saveCar(Car car);
    Car getCarAndDriver(Car car);
    boolean saveCarExceptDid(Car car);
}

