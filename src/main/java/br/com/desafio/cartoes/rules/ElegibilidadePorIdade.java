package br.com.desafio.cartoes.rules;

import br.com.desafio.cartoes.domain.entity.Cartao;
import br.com.desafio.cartoes.domain.enums.TipoCartao;
import br.com.desafio.cartoes.domain.model.Cliente;

import java.util.Collections;
import java.util.List;

public class ElegibilidadePorIdade implements DefineEligibilidade{

    @Override
    public List<Cartao> definir(Cliente cliente, List<Cartao> cartoes) {

        if(cliente.idadeCalculada() < 18) return Collections.emptyList();
        if(cliente.idadeCalculada() > 18 && cliente.idadeCalculada() < 25){
            return cartoes.stream()
                    .filter(c -> c.getTipoCartao().equals(TipoCartao.CARTAO_SEM_ANUIDADE))
                    .toList();
        }

        return cartoes;
    }
}
