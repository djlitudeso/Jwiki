package pers.jl.wiki.common.api;

/**
 * 断言处理类，用于抛出各种API异常
 * @author: JL Du
 * @date: 2022/3/3 22:46
 * @version: 1.0.0
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
