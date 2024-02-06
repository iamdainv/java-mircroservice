package com.coderjs.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
