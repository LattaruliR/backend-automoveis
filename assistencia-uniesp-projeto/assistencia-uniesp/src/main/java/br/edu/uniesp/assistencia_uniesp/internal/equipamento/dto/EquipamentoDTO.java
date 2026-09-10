package br.edu.uniesp.assistencia_uniesp.internal.equipamento.dto;

import java.util.Objects;

public record EquipamentoDTO(Long id, String tipo, String marca, String modelo, int numeroSerie) {
    public EquipamentoDTO(Long id, String tipo, String marca, String modelo, int numeroSerie) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;

        Objects.requireNonNull(tipo);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(modelo);
    }
}
