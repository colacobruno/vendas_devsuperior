package com.colaco.dsvendas.controllers.docs;


import com.colaco.dsvendas.dto.SaleDTO;
import com.colaco.dsvendas.dto.SaleSuccessDTO;
import com.colaco.dsvendas.dto.SaleSumDTO;
import com.colaco.dsvendas.dto.SellerDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SaleDOC {

    @ApiOperation(
            value = "Retorna todas as vendas",
            nickname = "findAll", tags = { "Sales" })
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Ok")
            })
    ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable);


    @ApiOperation(
            value = "Retorna total por vendedor",
            nickname = "amountGroupedBySeller", tags = { "Sales" })
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Ok")
            })
    ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller();



    @ApiOperation(
            value = "Retorna a % de sucesso por vendedor",
            nickname = "successGroupedBySeller", tags = { "Sales" })
    @ApiResponses(
            {
                    @ApiResponse(code = 200, message = "Ok")
            })
    ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller();


}
