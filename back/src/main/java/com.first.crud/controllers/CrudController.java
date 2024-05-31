package com.first.crud.controllers;

import com.first.crud.domain.annotation.AnnotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/teste")
public class CrudController {

    @Autowired
    private AnnotationRepository repository;

//    private List<String> items = new ArrayList<>();

    @GetMapping
    public ResponseEntity getAllItems() {
        var allItems = repository.findAll();
        return ResponseEntity.ok(allItems);
    }

//    @PostMapping
//    public String addItem(@RequestBody String item) {
//        items.add(item);
//        return "Item added successfully";
//    }
}
