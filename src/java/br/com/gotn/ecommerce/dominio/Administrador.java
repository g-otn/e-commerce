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
public class Administrador extends Usuario {
    
    private String rg;
    private String cpf;
    
}
