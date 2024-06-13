package com.totex.gymapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class WorkoutExistsException extends GymException {
    private String detail;

    public WorkoutExistsException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.CONFLICT);

        pb.setTitle("Workout already exists");
        pb.setDetail(detail);

        return pb;
    }
}
