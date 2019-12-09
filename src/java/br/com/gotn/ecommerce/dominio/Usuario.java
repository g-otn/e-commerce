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
public class Usuario {
    
    private long id;
    
    private String login;
    private String senha;
    private String email;
    private String nome;
    
}
