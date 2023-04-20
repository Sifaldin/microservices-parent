package com.abbas.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record FraudService(FraudRepository fraudRepository) {
    public boolean isFraudulent(Integer customerId) {
        Fraud fraud = Fraud.builder().customerId(customerId).isFraudster(false)
                .createdAt(LocalDateTime.now()).build();
        fraudRepository.save(fraud);
        return false;
    }
}
