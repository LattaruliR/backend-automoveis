package br.edu.uniesp.assistencia_uniesp.internal.equipamento.entity;

import br.edu.uniesp.assistencia_uniesp.internal.cliente.entity.ClienteEntity;
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
    private String numeroSerie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;


    public EquipamentoEntity(Long id, String tipo, String numeroSerie) {
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

    public void associarCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }
}
