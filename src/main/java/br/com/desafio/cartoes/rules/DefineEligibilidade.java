package br.com.desafio.cartoes.rules;

import br.com.desafio.cartoes.domain.entity.Cartao;
import br.com.desafio.cartoes.domain.model.Cliente;

import java.util.List;

public interface DefineEligibilidade {
    List<Cartao> definir(Cliente cliente, List<Cartao> cartoes);
}
