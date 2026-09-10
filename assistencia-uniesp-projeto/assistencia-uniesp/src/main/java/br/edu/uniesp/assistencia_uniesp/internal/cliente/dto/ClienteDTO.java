package br.edu.uniesp.assistencia_uniesp.internal.cliente.dto;

import java.util.Objects;

public record ClienteDTO(Long id, String nome, int cpf, String email, boolean ativo) {
    public ClienteDTO(Long id, String nome, int cpf, String email, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.ativo = ativo;

        Objects.requireNonNull(nome);
        Objects.requireNonNull(email);
    }

}
// int id, String nome, int cpf, String email, boolean ativo