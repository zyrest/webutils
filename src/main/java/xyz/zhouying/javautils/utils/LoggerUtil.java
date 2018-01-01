package xyz.zhouying.javautils.utils;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

/**
 * Created by 96428 on 2017/7/21.
 * This in ssmjavaconfig, samson.common.utils
 */
public class LoggerUtil {
    /**
     * 是否开启Debug
     */
    public static boolean isDebug =  Logger.getLogger(LoggerUtil.class).isDebugEnabled();

    /**
     * Debug 输出
     * @param clazz  	目标.Class
     * @param message	输出信息
     */
    public static void info(Class<?> clazz , String message){
        Logger logger = Logger.getLogger(clazz);
        logger.info(message);
    }
    /**
     * Debug 输出
     * @param clazz  	目标.Class
     * @param fmtString 输出信息模板
     * @param value		输出信息填充值
     */
    public static void fmtInfo(Class<?> clazz, String fmtString, Object...value){
        if(StringUtils.isEmpty(fmtString)) return;

        if(null != value && value.length != 0)
            fmtString = String.format(fmtString, value);

        info(clazz, fmtString);
    }

    /**
     * Debug 输出
     * @param clazz  	目标.Class
     * @param message	输出信息
     */
    public static void debug(Class<?> clazz , String message){
        if(!isDebug) return;
        Logger logger = Logger.getLogger(clazz);
        logger.debug(message);
    }
    /**
     * Debug 输出
     * @param clazz  	目标.Class
     * @param fmtString 输出信息key
     * @param value		输出信息value
     */
    public static void fmtDebug(Class<?> clazz, String fmtString, Object...value){
        if(!isDebug) return;
        if(StringUtils.isEmpty(fmtString)) return;

        if(null != value && value.length != 0)
            fmtString = String.format(fmtString, value);

        debug(clazz, fmtString);
    }

    /**
     * Error 输出
     * @param clazz  	目标.Class
     * @param message	输出信息
     * @param e			异常类
     */
    public static void error(Class<?> clazz, Exception e, String message) {
        Logger logger = Logger.getLogger(clazz);

        if(null == e){
            logger.error(message);
            return;
        }

        logger.error(message, e);
    }
    /**
     * Error 输出
     * @param clazz  	目标.Class
     * @param message	输出信息
     */
    public static void error(Class<?> clazz, String message){
        error(clazz, null, message);
    }
    /**
     * 异常填充值输出
     * @param clazz 	目标.Class
     * @param fmtString	输出信息key
     * @param e			异常类
     * @param value		输出信息value
     */
    public static void fmtError(Class<?> clazz, Exception e, String fmtString, Object...value){
        if(StringUtils.isEmpty(fmtString)) return;

        if(null != value && value.length != 0)
            fmtString = String.format(fmtString, value);

        error(clazz, e, fmtString);
    }
    /**
     * 异常填充值输出
     * @param clazz		目标.Class
     * @param fmtString 输出信息key
     * @param value		输出信息value
     */
    public static void fmtError(Class<?> clazz, String fmtString, Object...value) {

        if(StringUtils.isEmpty(fmtString)) return;

        if(null != value && value.length != 0)
            fmtString = String.format(fmtString, value);

        error(clazz, fmtString);
    }
}
