package com.crud.portal.exceptions;

import javax.validation.ValidationException;

/**
 * used for handling known exception by developers
 * 
 * @author : Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 * @version 1.0
 * 
 */

public class ServiceException extends Throwable
{

    public static final int SOMETHNG_BAD_HAPPENED = 0;

    private int code;
    private ValidationException validationException;

    public ServiceException(ValidationException validationException)
    {
        this.validationException = validationException;
    }

    public ServiceException(int code)
    {
        super();
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause)
    {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(String message, Throwable cause)
    {
        super(message, cause);
        this.code = SOMETHNG_BAD_HAPPENED;
    }

    public ServiceException(int code, String message)
    {
        super(message);
        this.code = code;
    }

    public ServiceException(String message)
    {
        super(message);
        this.code = SOMETHNG_BAD_HAPPENED;
    }

    public ServiceException(int code, Throwable cause)
    {
        super(cause);
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public ValidationException getValidationException()
    {
        return validationException;
    }

    public void setValidationException(ValidationException validationException)
    {
        this.validationException = validationException;
    }

}