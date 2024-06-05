package com.totex.gymapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class ExerciseExistsException extends GymException {
    private String detail;

    public ExerciseExistsException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.CONFLICT);

        pb.setTitle("Exercise already exists");
        pb.setDetail(detail);

        return pb;
    }
}
