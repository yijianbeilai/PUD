package com.hz.practisemybatis.mapper;

import com.hz.practisemybatis.domain.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("driverMapper")
public interface DriverMapper {
    boolean saveDriver(Driver driver);
    Driver getDriverByDname(Driver driver);
    Driver getDriverByDid(Driver driver);
}
