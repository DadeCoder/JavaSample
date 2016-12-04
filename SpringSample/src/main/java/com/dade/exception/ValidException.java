package com.dade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Dade on 2016/12/1.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "test")
public class ValidException extends RuntimeException {
}
