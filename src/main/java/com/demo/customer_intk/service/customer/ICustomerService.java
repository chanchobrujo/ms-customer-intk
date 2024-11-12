package com.demo.customer_intk.service.customer;

import com.demo.customer_intk.model.dto.CustomerDto;
import com.demo.customer_intk.model.request.CustomerRequest;
import reactor.core.publisher.Mono;

public interface ICustomerService {
    Mono<CustomerDto> findById(String id);
}
