package pers.jl.wiki.service;

import org.springframework.stereotype.Service;
import pers.jl.wiki.entity.Test;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 20:35
 * @version: 1.0.0
 */
@Service
public interface TestService {

    List<Test> listAllTest();

}
