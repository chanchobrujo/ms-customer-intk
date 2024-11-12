package com.demo.customer_intk.document;

import com.demo.customer_intk.model.dto.AffiliationDto;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.Instant;

import static com.stater.intk.common.utils.GeneralUtils.generateId;
import static com.stater.intk.common.utils.MapperUtils.objectToObject;

@Data
public class AffiliationDocument {
    @Id
    private String id = generateId(30, false);
    private Instant createdDate = Instant.now();
    private String documentTye;
    private String documentNumber;

    private String productId;
    private String productName;
    private BigDecimal amount = new BigDecimal("0.0");

    public AffiliationDto toDto() {
        return objectToObject(this, AffiliationDto.class);
    }
}
