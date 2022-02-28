package pers.jl.wiki.dto.req;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JL Du
 * @date: 2022/2/28 23:34
 * @version: 1.0.0
 */
public class EbookReq {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;
}
