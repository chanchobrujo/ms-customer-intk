package com.demo.customer_intk.controller;

import com.demo.customer_intk.model.dto.CustomerDto;
import com.demo.customer_intk.service.customer.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService;

    @GetMapping
    public ResponseEntity<Mono<CustomerDto>> findById(@RequestParam String id) {
        return ok(this.customerService.findById(id));
    }
}
