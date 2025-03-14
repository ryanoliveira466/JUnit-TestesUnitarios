package estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<String, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

//       public void adicionarProduto(String nome, int quantidade) {
//        if (quantidade > 0) {
//            produtos.put(nome, quantidade);
//        }
//    }
//
// Se o produto já existe, atualiza o seu número com a quantidade
// ao invés de sobrescrever
//
//
//
//
//
    public int adicionarProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome) == true && quantidade > 0) {
            int estoqueAtual = produtos.get(nome);
            produtos.put(nome, quantidade + estoqueAtual);
            return 1;
        }

        if (produtos.containsKey(nome) == false && quantidade > 0) {
            produtos.put(nome, quantidade);
            return 2;
        }
        
        else{
            System.out.println("Quantidade menor/igual a 0");
            return -1;
        }

//        if (quantidade > 0) {
//        produtos.put(nome, produtos.getOrDefault(nome, 0) + quantidade);
//    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//     public void removerProduto(String nome, int quantidade) {
//        if (produtos.containsKey(nome) && quantidade > 0) {
//            int estoqueAtual = produtos.get(nome);
//            produtos.put(nome, estoqueAtual - quantidade);
//        }
//    }
//
// Se a quantidade no final da subtração resultasse em um valor negativo,
//    o produto em etoque ficaria negativo, o que não faz sentido.
//   Então coloquei um If/Else dizendo que, se a subtração der menor que zero
//           Então o valor é 0 se não, faça a subtração com o resultado final
//
//
//
//    
    public int removerProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome) && quantidade > 0) {
            int estoqueAtual = produtos.get(nome);
            int estoqueAtualizado = 0;

            if (estoqueAtual - quantidade < 0) {
                estoqueAtualizado = 0;
            } else {
                estoqueAtualizado = estoqueAtual - quantidade;
            }
            produtos.put(nome, estoqueAtualizado);
            return 1;
        }
        
        else{
            System.out.println("Produto não existe ou quantidade menor/igual a 0");
            return -1;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    ///  public int consultarEstoque(String nome) {
    ///     return produtos.get(nome);
    ///}
    /// Se o produto não existisse, retornaria um erro, então 
    ///Para previnir isso, colocamos um if/else
    ///
    public int consultarEstoque(String nome) {
        if (produtos.containsKey(nome)) {
            return produtos.get(nome);
        } else {
            System.out.println("Produto não existe");
            return -1;
        }

    }
}
