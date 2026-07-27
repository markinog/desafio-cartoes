package br.com.desafio.cartoes.rules;

import br.com.desafio.cartoes.domain.entity.Cartao;
import br.com.desafio.cartoes.domain.model.Cliente;

import java.util.List;

public class EligibilidadePorRenda implements DefineEligibilidade{

    @Override
    public List<Cartao> definir(Cliente cliente, List<Cartao> cartoes) {
        return cartoes.stream()
                .filter(c -> c.getRendaMinima().compareTo(cliente.getRendaMensal()) >= 0)
                .toList();
    }
}
