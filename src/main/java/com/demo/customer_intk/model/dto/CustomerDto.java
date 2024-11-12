package com.demo.customer_intk.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CustomerDto {
    private String fullName;
    private String documentTye;
    private String documentNumber;
    private List<AffiliationDto> affiliations = new ArrayList<>();
}
