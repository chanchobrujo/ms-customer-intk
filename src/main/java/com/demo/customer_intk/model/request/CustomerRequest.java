package com.demo.customer_intk.model.request;

import com.demo.customer_intk.document.CustomerDocument;
import lombok.Data;

import static com.stater.intk.common.utils.MapperUtils.objectToObject;

@Data
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String documentTye;
    private String documentNumber;

    public CustomerDocument toDocument() {
        return objectToObject(this, CustomerDocument.class);
    }
}
