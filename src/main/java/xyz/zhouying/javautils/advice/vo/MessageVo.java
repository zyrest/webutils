package xyz.zhouying.javautils.advice.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by 96428 on 2017/7/17.
 * This in TestWeixin, samson.back.dto
 */
@Data
public class MessageVo {
    private Integer status;
    private String message;
    private Object data;
    private String redirectUrl;
    private Date time = new Date();
}
