package com.simulator.sms.customer.service.api;

import com.simulator.api.TelcoApi;
import com.simulator.sms.customer.service.service.TelcoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequiredArgsConstructor
@Slf4j
public class TelcoApiDelegateImpl implements TelcoApi {

    private final TelcoService telcoService;

    @Override
    public ResponseEntity<String> receiveSmsFromCustomer(String username, String password, String mobile, String message) {

        log.info("Received SMS - user: {}, mobile: {}, message: {}", username, mobile, message);
        String response = telcoService.receiveSmsFromCustomer(username, password, mobile, message);
        return ResponseEntity.ok(response);
    }
}
