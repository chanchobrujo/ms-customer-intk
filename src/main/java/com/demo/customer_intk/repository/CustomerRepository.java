package com.demo.customer_intk.repository;

import com.demo.customer_intk.document.CustomerDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<CustomerDocument, String> {
}
