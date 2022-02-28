package pers.jl.wiki.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.jl.wiki.common.api.CommonResult;
import pers.jl.wiki.mbg.entity.Ebook;
import pers.jl.wiki.service.EbookService;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 22:31
 * @version: 1.0.0
 */

@RequestMapping("/ebook")
@Controller
@Api(tags = "EbookController", description = "电子书管理")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @ApiOperation("获取电子书列表")
    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Ebook>> getEbookList(){
        return CommonResult.success(ebookService.listAllEbook());
    }

}
