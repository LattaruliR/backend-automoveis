package br.edu.uniesp.assistencia_uniesp.internal.equipamento.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Table(name = "equipamentos")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class EquipamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false, length = 150)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false, unique = true)
    private int numeroSerie;

    public EquipamentoEntity(Long id, String tipo, int numeroSerie) {
        this.id = id;
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public void alterarMarca(String marca) {
        this.marca = marca;
    }

    public void alterarModelo(String modelo) {
        this.modelo = modelo;
    }
}
