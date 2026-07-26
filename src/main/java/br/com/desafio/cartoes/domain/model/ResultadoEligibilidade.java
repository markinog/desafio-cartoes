package br.com.desafio.cartoes.domain.model;

import br.com.desafio.cartoes.domain.entity.Cartoes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultadoEligibilidade {

    private List<Cartoes> cartoesAprovados;
    private String motivoReprova;
    private Boolean contemReprovados;

    public ResultadoEligibilidade comAprovados(List<Cartoes> aprovados){
        this.cartoesAprovados = aprovados;
        return this;
    }

    public ResultadoEligibilidade comReprovados(String motivo, Boolean contemReprovados){
        this.motivoReprova = motivo;
        this.contemReprovados = true;
        this.cartoesAprovados = Collections.emptyList();
        return this;
    }
}
