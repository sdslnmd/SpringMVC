package com.mkyong.common.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOImpl implements MovieDAO {
    @Override
    public String getName(long employeeId) {
        return "success";
    }
}
