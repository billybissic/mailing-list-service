/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.DuplicateSubscriberException;
import exception.DuplicateSubscriberGroupException;
import exception.NoDataAvailableException;
import exception.NoUnassignedSubscribersFoundException;
import exception.SubscriberNotFoundException;

/**
 * @author Billy Bissic
 *
 */

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class MailingListControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(DuplicateSubscriberException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors duplicateSubscriberException(DuplicateSubscriberException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(DuplicateSubscriberGroupException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors dublicateSubscriberGroupException(DuplicateSubscriberGroupException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(SubscriberNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors subscriberNotFoundException(SubscriberNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvaialbleException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoUnassignedSubscribersFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noUnassignedSubscribersFound(NoUnassignedSubscribersFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}


