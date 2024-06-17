package com.springandlombok.hellolombok.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springandlombok.hellolombok.dto.PessoaDTO;

@RestController("/pessoa")
public class PessoaController {
    
    @GetMapping
    public List<PessoaDTO> listar() {
        return List.of(PessoaDTO.builder()
            .nome("girdacio")
            .email("girdacio@gmail.com")
            .idade(32)
            .build());
    }
}
