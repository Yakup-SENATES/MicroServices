package com.jacop.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}