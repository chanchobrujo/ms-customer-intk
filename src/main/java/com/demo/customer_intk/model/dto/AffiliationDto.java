package com.demo.customer_intk.model.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class AffiliationDto {
    private String id;
    private String productId;
    private Instant createdDate;
    private String productName;
    private BigDecimal amount;
}
