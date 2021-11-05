package com.colaco.dsvendas.controllers;

import com.colaco.dsvendas.controllers.docs.SellerDOC;
import com.colaco.dsvendas.dto.SellerDTO;
import com.colaco.dsvendas.services.SellerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
@Api(tags = { "Sellers"})
public class SellerController implements SellerDOC {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }


}
