package br.com.gotn.ecommerce.dominio;

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
public class Endereco {
    
    private String cep;
    private String estado;
    private String cidade;
    private String logradouro;
    private String numero;
    private String complemento;
    
}
