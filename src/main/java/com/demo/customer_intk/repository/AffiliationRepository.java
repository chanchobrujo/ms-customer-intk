package com.demo.customer_intk.repository;

import com.demo.customer_intk.document.AffiliationDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface AffiliationRepository extends ReactiveMongoRepository<AffiliationDocument, String> {
    Flux<AffiliationDocument> findByDocumentTyeAndDocumentNumber(String type, String number);
}
