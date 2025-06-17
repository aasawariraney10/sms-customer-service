package com.simulator.sms.customer.service.api;

import com.simulator.api.TelcoApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class TelcoApiDelegateImpl implements TelcoApi {

    @Override
    public ResponseEntity<String> telcoSendmsgGet(String username, String password, String mobile, String message) {

        System.out.printf("Received SMS - user: %s, mobile: %s, message: %s%n", username, mobile, message);
        String response = String.format("STATUS: ACCEPTED~~\nRESPONSE_CODE: SUCCESS~~%s", "12345ABC");
        return ResponseEntity.ok(response);
    }
}
