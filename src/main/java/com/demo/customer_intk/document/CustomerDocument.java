package com.demo.customer_intk.document;

import com.demo.customer_intk.model.dto.CustomerDto;
import lombok.Data;
import org.springframework.data.annotation.Id;

import static com.stater.intk.util.GeneralUtil.generateId;
import static com.stater.intk.util.MapperUtils.objectToObject;

@Data
public class CustomerDocument {
    @Id
    private String id = generateId(25);
    private String firstName;
    private String lastName;
    private String documentTye;
    private String documentNumber;

    public CustomerDto toDto() {
        CustomerDto dto = objectToObject(this, CustomerDto.class);
        dto.setFullName(this.getFirstName().concat(" ").concat(this.getLastName()));
        return dto;
    }
}
