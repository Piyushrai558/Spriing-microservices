package com.app.customer;

public final class CustomerService {
    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "CustomerService[]";
    }

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().firstname(request.firstName)
                .lastname(request.lastName)
                .email(request.email)
                .build();
        //todo validation check in the input
    }
}
