package com.example.restaurant.booking.api;

import com.example.restaurant.booking.model.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableApiController {

    @GetMapping("/api/table")
    public Table getTable() {
        return new Table();
    }
}
