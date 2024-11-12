package com.demo.customer_intk.document;

import com.demo.customer_intk.model.dto.CustomerDto;
import com.stater.intk.common.utils.GeneralUtils;
import com.stater.intk.common.utils.MapperUtils;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CustomerDocument {
    @Id
    private String id = GeneralUtils.generateId(30, false);
    private String firstName;
    private String lastName;
    private String documentTye;
    private String documentNumber;

    public CustomerDto toDto() {
        CustomerDto dto = MapperUtils.objectToObject(this, CustomerDto.class);
        dto.setFullName(this.getFirstName().concat(" ").concat(this.getLastName()));
        return dto;
    }
}
