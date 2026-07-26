package br.com.desafio.cartoes.domain.entity;

import br.com.desafio.cartoes.domain.enums.TipoCartao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name = "cartoes_oferta")
@NoArgsConstructor
@AllArgsConstructor
public class Cartoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private TipoCartao tipoCartao;

    @Column(precision = 11, scale = 2, nullable = false)
    private BigDecimal rendaMinima;

    @Column(precision = 11, scale = 2, nullable = false)
    private BigDecimal valorAnuidade;

    @Column(nullable = false)
    @Builder.Default
    private Boolean ativo = true;

    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
        this.setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void onUpdate(){
        this.setUpdatedAt(LocalDateTime.now());
    }

}
