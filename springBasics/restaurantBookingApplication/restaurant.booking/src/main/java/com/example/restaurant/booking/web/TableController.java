package com.example.restaurant.booking.web;

import com.example.restaurant.booking.model.Table;
import com.example.restaurant.booking.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TableController {

    @Autowired
    private TableRepository tableRepository;

    @GetMapping("/table")
    public String tableForm(Model model) {
        Table table = new Table();
        model.addAttribute("table", table);
        return "table";
    }

    @PostMapping("/table")
    public String submitTable(@ModelAttribute Table table, Model model) {
        tableRepository.save(table);
        model.addAttribute("table", table);
        return "result";
    }

    @GetMapping("/table/view")
    public String viewOneTable(@RequestParam("id") Integer id, Model model) {
        Table table = tableRepository.getOne(id);
        model.addAttribute("table", table);
        return "result";
    }

    @DeleteMapping("/table/view")
    public String deleteOneTable(@RequestParam("id") Integer id) {
        Table table = tableRepository.getOne(id);
        tableRepository.delete(table);
        return "result";
    }

}
