package com.msr.servicebase.exception;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义异常类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MSRException extends RuntimeException{
    @ApiModelProperty(value = "状态码")
    private Integer code;//异常编码
    private String msg; //异常消息

    @Override
    public String toString() {
        return "MSRException{" +
                "message=" + this.getMessage() +
                ", code=" + code +
                '}';
    }
}
