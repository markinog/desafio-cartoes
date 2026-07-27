package br.com.desafio.cartoes.rules;

import br.com.desafio.cartoes.domain.entity.Cartao;
import br.com.desafio.cartoes.domain.enums.TipoCartao;
import br.com.desafio.cartoes.domain.model.Cliente;

import java.util.List;

import static br.com.desafio.cartoes.util.ClienteInfoValidator.isSpecialUf;

public class EligibilidadeEspecialUf implements DefineEligibilidade{

    @Override
    public List<Cartao> definir(Cliente cliente, List<Cartao> cartoes) {
        if(isSpecialUf(cliente)){
            if(cliente.idadeCalculada() > 25 &&  cliente.idadeCalculada() < 30){
                return cartoes;
            }

            return cartoes.stream()
                    .filter(c -> c.getTipoCartao() != TipoCartao.CARTAO_PARCEIRO)
                    .toList();
        }
        return cartoes;
    }
}
