package com.demo.customer_intk.service.affiliation;

import com.demo.customer_intk.document.AffiliationDocument;
import com.demo.customer_intk.model.dto.AffiliationDto;
import com.demo.customer_intk.repository.AffiliationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AffiliationService implements IAffiliationService {
    private final AffiliationRepository repository;

    @Override
    public Flux<AffiliationDto> findByDocument(String type, String number) {
        return this.repository
                .findByDocumentTyeAndDocumentNumber(type, number)
                .map(AffiliationDocument::toDto);
    }
}
