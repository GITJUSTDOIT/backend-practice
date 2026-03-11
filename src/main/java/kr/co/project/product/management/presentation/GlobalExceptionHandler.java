package kr.co.project.product.management.presentation;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolatedException(
            ConstraintViolationException ex
    ) {
        String errorMessage = "에러 메시지";
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
