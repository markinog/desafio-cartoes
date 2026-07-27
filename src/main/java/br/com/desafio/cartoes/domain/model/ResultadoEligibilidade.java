package br.com.desafio.cartoes.domain.model;

import br.com.desafio.cartoes.domain.entity.Cartao;
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

    private List<Cartao> cartoesprovados;
    private String motivoReprova;
    private Boolean contemReprovados;

    public ResultadoEligibilidade comAprovados(List<Cartao> aprovados){
        this.cartoesprovados = aprovados;
        return this;
    }

    public ResultadoEligibilidade comReprovados(String motivo, Boolean contemReprovados){
        this.motivoReprova = motivo;
        this.contemReprovados = true;
        this.cartoesprovados = Collections.emptyList();
        return this;
    }
}
