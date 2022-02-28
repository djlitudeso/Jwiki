package pers.jl.wiki.common.api;

/**
 * 封装API的错误代码
 * @author: JL Du
 * @date: 2022/2/28 17:15
 * @version: 1.0.0
 */
public interface IErrorCode {
    /**
     * 获取错误代码
     * @return 错误代码
     */
    long getCode();

    /**
     * 获取描述信息
     * @return 描述信息
     */
    String getMessage();
}
