package com.project.ticket.exception;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.ticket.exception.detail.EmailAlreadyUsed;
import com.project.ticket.exception.detail.EntityNotFound;
import com.project.ticket.exception.detail.IllegalAction;
import com.project.ticket.exception.detail.Unautorized;
import com.project.ticket.exception.detail.UnvalidCredential;
import com.project.ticket.exception.detail.UsernameNotAvailable;



	@Order(Ordered.HIGHEST_PRECEDENCE)
	@ControllerAdvice
	public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	    @ExceptionHandler(EntityNotFound.class)
	    public ResponseEntity<Object> handleEntityNotFound(
	            EntityNotFound ex) {
	        ApiException apiException = new ApiException(NOT_FOUND);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    @ExceptionHandler(EmailAlreadyUsed.class)
	    public ResponseEntity<Object> handleEmailInUse(
	            EmailAlreadyUsed ex) {
	        ApiException apiException = new ApiException(HttpStatus.NOT_ACCEPTABLE);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    @ExceptionHandler(UsernameNotAvailable.class)
	    public ResponseEntity<Object> handleUsernameTaken(
	            UsernameNotAvailable ex) {
	        ApiException apiException = new ApiException(HttpStatus.NOT_ACCEPTABLE);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    @ExceptionHandler(Unautorized.class)
	    public ResponseEntity<Object> handleUnauthorized(
	            Unautorized ex) {
	        ApiException apiException = new ApiException(HttpStatus.UNAUTHORIZED);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    @ExceptionHandler(UnvalidCredential.class)
	    public ResponseEntity<Object> handleInvalidCredentials(
	            UnvalidCredential ex) {
	        ApiException apiException = new ApiException(HttpStatus.UNAUTHORIZED);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    @ExceptionHandler(IllegalAction.class)
	    public ResponseEntity<Object> handleIllegalAction(
	            IllegalAction ex) {
	        ApiException apiException = new ApiException(HttpStatus.FORBIDDEN);
	        apiException.setMessage(ex.getMessage());
	        return buildResponseEntity(apiException);
	    }

	    private ResponseEntity<Object> buildResponseEntity(ApiException ex) {
	        return new ResponseEntity<>(ex, ex.getStatus());
	    }
}
