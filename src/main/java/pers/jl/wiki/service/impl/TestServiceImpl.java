package pers.jl.wiki.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jl.wiki.entity.Test;
import pers.jl.wiki.mapper.TestMapper;
import pers.jl.wiki.service.TestService;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 20:40
 * @version: 1.0.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> listAllTest() {

        return testMapper.getInfo();

    }
}
