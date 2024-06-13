package com.totex.gymapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class UserExistsException extends GymException {
    private String detail;

    public UserExistsException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.CONFLICT);

        pb.setTitle("User already exists");
        pb.setDetail(detail);

        return pb;
    }
}
