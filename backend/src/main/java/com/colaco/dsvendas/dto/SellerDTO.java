package com.colaco.dsvendas.dto;

import com.colaco.dsvendas.entities.Sale;
import com.colaco.dsvendas.entities.Seller;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
