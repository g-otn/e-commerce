package br.com.gotn.ecommerce.dominio;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produto {
    
    private long id;
    
    private String nome;
    private String descricao;
    private double preco;
    private UUID hashImagem;
    
}
