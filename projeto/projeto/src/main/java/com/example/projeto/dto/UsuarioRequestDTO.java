package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatorio.")
    @Size(min = 2,message = "O nome deve ter no minimo dois caracteres.")
    @Size(max = 100,message = "O nome deve ter no minimo cem caracteres.")

    private String nome;

    @NotBlank(message = "0 e-mail e obrigatorio.")
    @Email(message = "Deve ser um email valido.")
    private String email;

    @NotBlank(message = "A senha e obrigatorio.")
    @Size(min = 3,max = 8,message = "A senha deve ter de 3 a 8 digitos.")
    private String senha;
}
