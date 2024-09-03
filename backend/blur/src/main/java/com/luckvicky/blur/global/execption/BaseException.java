package com.luckvicky.blur.global.execption;

import com.luckvicky.blur.global.enums.code.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseException extends RuntimeException {

    private final ErrorCode errorCode;

}

