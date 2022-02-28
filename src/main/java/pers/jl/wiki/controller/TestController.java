package pers.jl.wiki.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.jl.wiki.common.api.CommonResult;
import pers.jl.wiki.entity.Test;
import pers.jl.wiki.service.TestService;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 20:47
 * @version: 1.0.0
 */
@RequestMapping("/jl")
@Controller
@Api(tags = "PmsBrandController", description = "商品品牌管理")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Test>> getAll(){
        return CommonResult.success(testService.listAllTest());

    }

}
