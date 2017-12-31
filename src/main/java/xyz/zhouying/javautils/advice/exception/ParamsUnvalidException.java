package xyz.zhouying.javautils.advice.exception;

import org.springframework.validation.Errors;

/**
 * Created by 96428 on 2017/8/7.
 * This in hospital, io.github.cyingyo.hospital.common.exception
 */
public class ParamsUnvalidException extends CustomException {
    private Errors errors;

    public ParamsUnvalidException(String mes, Errors errors) {
        super(mes);
        this.errors = errors;
    }

    public ParamsUnvalidException(String mes) {
        super(mes);
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
