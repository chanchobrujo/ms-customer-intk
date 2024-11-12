package com.demo.customer_intk.service.customer;

import com.demo.customer_intk.document.CustomerDocument;
import com.demo.customer_intk.model.dto.CustomerDto;
import com.demo.customer_intk.repository.CustomerRepository;
import com.demo.customer_intk.service.affiliation.IAffiliationService;
import com.stater.intk.model.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.error;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository;
    private final IAffiliationService affiliationService;

    @Override
    public Mono<CustomerDto> findById(String id) {
        return this.customerRepository
                .findById(id)
                .switchIfEmpty(error(new BusinessException("Cliente no encontrado.")))
                .map(CustomerDocument::toDto)
                .flatMap(this::setAffiliations);
    }

    private Mono<CustomerDto> setAffiliations(CustomerDto customer) {
        return this.affiliationService
                .findByDocument(customer.getDocumentTye(), customer.getDocumentNumber())
                .collectList()
                .doOnNext(customer::setAffiliations)
                .thenReturn(customer);
    }
}
