package com.colaco.dsvendas.dto;

import com.colaco.dsvendas.entities.Seller;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;


    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
