# Desafio: Sistema de Controle de Estoque

## Objetivo

Você recebeu um código incompleto de um Sistema de Controle de Estoque. Seu desafio é:

1. Criar testes unitários usando `JUnit` para verificar se o código funciona corretamente.

2. Identificar erros e inconsistências no código.

3. Corrigir os problemas encontrados.

>[!IMPORTANT]
>**Não confie no código! Teste tudo antes de assumir que está certo.**


## Código do Sistema de Estoque (com erros escondidos)

```java
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        if (quantidade > 0) {
            produtos.put(nome, quantidade);
        }
    }

    public void removerProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome) && quantidade > 0) {
            int estoqueAtual = produtos.get(nome);
            produtos.put(nome, estoqueAtual - quantidade);
        }
    }

    public int consultarEstoque(String nome) {
        return produtos.get(nome);
    }
}
```

---

## O que você deve fazer?

* Criar um arquivo de teste `JUnit` chamado `EstoqueTest.java`.   
* Criar métodos de teste para cada funcionalidade do estoque.   
* Utilizar as anotações e métodos de asserção aprendidos (`@Test`, `@BeforeEach`, `assertEquals`, `assertTrue`, etc.).   
* Identificar erros no código e corrigi-los.   

## Alguns possíveis problemas para verificar:

* O sistema permite adicionar um produto com quantidade negativa?   
* O sistema lida corretamente com produtos inexistentes ao consultar/remover?   
* A remoção de produtos não deixa o estoque com valores inválidos?   

---

## Exemplo de Teste (comece com algo assim e expanda!)

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {
    private Estoque estoque;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
        estoque.adicionarProduto("Arroz", 10);
    }

    @Test
    @DisplayName("✅ Teste de Adicionar Produto")
    void testAdicionarProduto() {
        estoque.adicionarProduto("Feijão", 5);
        assertEquals(5, estoque.consultarEstoque("Feijão"));
    }

    @Test
    @DisplayName("⚠️ Teste de Remover Produto")
    void testRemoverProduto() {
        estoque.removerProduto("Arroz", 5);
        assertEquals(5, estoque.consultarEstoque("Arroz"));
    }
}
```

---

## Conclusão

- **Escreva testes para cada funcionalidade.**   
- **Descubra os erros no código!**   
- **Corrija os bugs e garanta que tudo funcione corretamente.**   


