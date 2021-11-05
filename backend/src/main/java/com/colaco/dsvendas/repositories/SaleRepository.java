package com.colaco.dsvendas.repositories;

import com.colaco.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
