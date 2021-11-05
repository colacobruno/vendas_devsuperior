package com.colaco.dsvendas.controllers.docs;

import com.colaco.dsvendas.dto.SellerDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SellerDOC {

    @ApiOperation(
            value = "Retorna todos os vendedores",
            nickname = "findAll", tags = { "Sellers" })
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Ok")
            })
    ResponseEntity<List<SellerDTO>> findAll();

}
