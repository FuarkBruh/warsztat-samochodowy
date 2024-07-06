package com.example.warsztat_samochodowy.repository;

import com.example.warsztat_samochodowy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Dodatkowe metody związane z repozytorium, jeśli potrzebujesz
}
