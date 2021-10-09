package com.example.restaurant.booking.repository;

import com.example.restaurant.booking.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table, Integer> {

}
