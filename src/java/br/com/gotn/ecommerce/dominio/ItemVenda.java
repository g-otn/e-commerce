package br.com.gotn.ecommerce.dominio;

import br.com.gotn.ecommerce.dominio.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ItemVenda {

    private Produto produto;
    private int quantidade;

}
