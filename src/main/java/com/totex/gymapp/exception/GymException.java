package com.totex.gymapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class GymException extends RuntimeException {
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("Gym internal Server Error");

        return pb;
    }
}
