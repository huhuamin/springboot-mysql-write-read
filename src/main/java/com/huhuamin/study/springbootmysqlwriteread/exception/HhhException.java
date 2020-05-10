package com.huhuamin.study.springbootmysqlwriteread.exception;

/**
 * @Auther: Huhuamin
 * @Date: 2020/5/10 11:54
 * @Description:
 */
public class HhhException extends RuntimeException {
    public HhhException(String message) {
        super(message);
    }

    public HhhException(String message, Throwable cause) {
        super(message, cause);
    }
}
