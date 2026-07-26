package br.com.desafio.cartoes.domain.enums;


public enum TipoCartao {

    CARTAO_SEM_ANUIDADE("CARTAO_SEM_ANUIDADE", 3500.00),
    CARTAO_PARCEIRO("CARTAO_SEM_ANUIDADE", 5500.00),
    CARTAO_COM_CASHBACK("CARTAO_SEM_ANUIDADE", 7500.00);

    private final String descricao;
    private final double rendaMinima;

    TipoCartao(String descricao, double rendaMinima) {
        this.descricao = descricao;
        this.rendaMinima = rendaMinima;
    }
}
