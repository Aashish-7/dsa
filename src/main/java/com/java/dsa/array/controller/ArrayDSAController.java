package com.java.dsa.array.controller;

import com.java.dsa.array.service.ArrayDSAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ArrayDSAController {

    ArrayDSAService arrayDSAService;

    @Autowired
    public ArrayDSAController(ArrayDSAService arrayDSAService) {
        this.arrayDSAService = arrayDSAService;
    }

    @PostMapping("/maxAndMinElementInArray")
    public Map<String, Integer> maxAndMinElementInArray(@RequestParam Integer[] elements){
        return arrayDSAService.maxAndMinElementInArray(elements);
    }

    @PostMapping("/reverseTheArray")
    public Map<String, Integer[]> reverseTheArray(@RequestParam Integer[] elements){
        return arrayDSAService.reverseTheArray(elements);
    }
}
