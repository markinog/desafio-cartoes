package br.com.desafio.cartoes.util;

import br.com.desafio.cartoes.domain.model.Cliente;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ClienteInfoValidator {

    private static final String SP = "SP";

    public static boolean isValidUf(String uf){
        List<String>validUfs = List.of(
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
                "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO",
                "RR", "SC", "SP", "SE", "TO");

        return validUfs.contains(uf);
    }

    public static boolean isSpecialUf(Cliente cliente){
        if(cliente.getUf() == null  || cliente.getUf().isEmpty() || !isValidUf(cliente.getUf())) return false;
        return cliente.getUf().equals(SP);
    }
}
