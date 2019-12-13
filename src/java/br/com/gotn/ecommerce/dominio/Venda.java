package br.com.gotn.ecommerce.dominio;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Venda {
    
    private List<ItemVenda> itens;
    private LocalDate data;
    
    public double getTotal() {
        double total = 0D;
        for (ItemVenda item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }
    
}
