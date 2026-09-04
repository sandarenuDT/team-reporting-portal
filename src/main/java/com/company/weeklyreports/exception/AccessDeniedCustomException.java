package com.company.weeklyreports.exception;

// A domain-level ownership violation (e.g. team member tries to open
// another member's report). Distinct from Spring Security's own
// AccessDeniedException, which handles missing role authority.
public class AccessDeniedCustomException extends RuntimeException {
    public AccessDeniedCustomException(String message) {
        super(message);
    }
}