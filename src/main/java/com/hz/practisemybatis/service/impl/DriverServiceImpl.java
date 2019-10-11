package com.hz.practisemybatis.service.impl;

import com.hz.practisemybatis.domain.Driver;
import com.hz.practisemybatis.mapper.DriverMapper;
import com.hz.practisemybatis.service.DriverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("driverService")
public class DriverServiceImpl implements DriverService {
    @Resource
    private DriverMapper driverMapper;

    @Override
    public boolean saveDriver(Driver driver) {
        return driverMapper.saveDriver(driver);
    }

    @Override
    public Driver getDriverByDname(Driver driver) {
        return driverMapper.getDriverByDname(driver);
    }

    @Override
    public Driver getDriverByDid(Driver driver) {
        return driverMapper.getDriverByDid(driver);
    }
}
