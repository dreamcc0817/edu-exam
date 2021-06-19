package com.enfi.exam.interfaces.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * restful返回内容结构体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 包含的数据
	 */
    private T data;
    /**
     * 状态代码，0：成功；其他都是失败
     */
    private Integer code;
    /**
     *
     */
    private String msg;

    public static <T> Result<T> succeed() {
        return new Result<T>(null, 0, "succeed");
    }

    public static <T> Result<T> succeed(String msg) {
        return new Result<T>(null, 0, msg);
    }

    public static <T> Result<T> succeed(String msg, T data) {
    	return new Result<T>(data, 0, msg);
    }

    public static <T> Result<T> succeed(T data) {
        return new Result<T>(data, 0, "succeed");
    }

    public static <T> Result<T> failed(String msg) {
        return new Result<T>(null, 500, msg);
    }

    public static <T> Result<T> failed(String msg, T data) {
    	return new Result<T>(data, 1, msg);
    }

}
