package br.com.gotn.ecommerce.carrinho;

import br.com.gotn.ecommerce.dominio.Produto;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Carrinho {

    private final List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        this.itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void removerProduto(Produto produto) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().equals(produto)) {
                this.itens.remove(i);
                return;
            }
        }
    }

    public void alterarQuantidade(Produto produto, int novaQuantidade) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().equals(produto)) {
                this.itens.get(i).setQuantidade(novaQuantidade);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getQuantidade() * itens.get(i).getProduto().getPreco();
        }
        return total;
    }

}
