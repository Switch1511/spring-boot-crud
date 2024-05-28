package com.first.crud.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/")
public class CrudController {

    private List<String> items = new ArrayList<>();

    @GetMapping
    public List<String> getItems() {
        return items;
    }

    @PostMapping
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item added successfully";
    }
}
