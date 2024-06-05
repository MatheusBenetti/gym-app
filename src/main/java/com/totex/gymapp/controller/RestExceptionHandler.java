package com.totex.gymapp.controller;

import com.totex.gymapp.exception.GymException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(GymException.class)
    public ProblemDetail handleGymException(GymException e) {
        return e.toProblemDetail();
    }
}
