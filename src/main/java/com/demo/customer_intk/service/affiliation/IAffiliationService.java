package com.demo.customer_intk.service.affiliation;

import com.demo.customer_intk.model.dto.AffiliationDto;
import reactor.core.publisher.Flux;

public interface IAffiliationService {
    Flux<AffiliationDto> findByDocument(String type, String number);
}
