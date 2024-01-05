package com.sujit.KafkaMessageProducer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentProcessing {

    private String transactionId;
    private String srcAccount;
    private String destAccount;
    private double amount;
    private Date date;

}
