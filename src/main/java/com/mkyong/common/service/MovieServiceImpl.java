package com.mkyong.common.service;

import com.mkyong.common.dao.MovieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDAO movieDAO;

    @Override
    public String getName(long id) {
        return movieDAO.getName(id);
    }
}
