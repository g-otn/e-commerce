package br.com.gotn.ecommerce.carrinho;

import br.com.gotn.ecommerce.dominio.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ItemCarrinho {

    private Produto produto;
    private int quantidade;

}
