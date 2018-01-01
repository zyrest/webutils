package xyz.zhouying.javautils.utils;


import xyz.zhouying.javautils.advice.consts.ResponseStatus;
import xyz.zhouying.javautils.advice.vo.MessageVo;

/**
 * Created by 96428 on 2017/9/12.
 * This in weixin-edu, com.outstudio.weixin.common.utils
 */
public class MessageVoUtil {
    public static MessageVo success() {
        MessageVo m = new MessageVo();

        m.setStatus(ResponseStatus.SUCCESS);
        m.setMessage("success");

        return m;
    }

    public static MessageVo success(Object data) {
        MessageVo messageVo = new MessageVo();

        messageVo.setStatus(ResponseStatus.SUCCESS);
        messageVo.setMessage("success");
        messageVo.setData(data);

        return messageVo;
    }

    public static MessageVo success(String redirectUrl, Object data) {
        MessageVo messageVo = new MessageVo();

        messageVo.setStatus(ResponseStatus.SUCCESS);
        messageVo.setMessage("success");
        messageVo.setData(data);
        messageVo.setRedirectUrl(redirectUrl);

        return messageVo;
    }
}
