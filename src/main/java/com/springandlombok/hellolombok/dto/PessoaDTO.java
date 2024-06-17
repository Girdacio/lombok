package com.springandlombok.hellolombok.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PessoaDTO {

    private String nome;
    private String email;
    private int idade;
    
}
