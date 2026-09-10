package br.edu.uniesp.assistencia_uniesp.internal.cliente.entity;

import br.edu.uniesp.assistencia_uniesp.internal.equipamento.entity.EquipamentoEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "clientes")
@Entity
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private boolean ativo = true;

    @OneToMany(mappedBy = "cliente")
    private List<EquipamentoEntity> equipamentos;

    public ClienteEntity(Long id, String cpf, String email) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarEquipamento(EquipamentoEntity equipamento) {
        equipamentos.add(equipamento);
        equipamento.associarCliente(this);
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }
}
