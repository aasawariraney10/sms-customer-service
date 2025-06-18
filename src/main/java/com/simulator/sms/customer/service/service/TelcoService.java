package com.simulator.sms.customer.service.service;

public interface TelcoService {
    String receiveSmsFromCustomer(String username, String password, String mobile, String message);
}
