package com.colaco.dsvendas.repositories;

import com.colaco.dsvendas.dto.SaleSuccessDTO;
import com.colaco.dsvendas.dto.SaleSumDTO;
import com.colaco.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.colaco.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            " FROM Sale obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();


    @Query("SELECT new com.colaco.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM (obj.deals))" +
            " FROM Sale obj GROUP BY obj.seller")
    List<SaleSuccessDTO> sucessGroupedBySeller();
}
