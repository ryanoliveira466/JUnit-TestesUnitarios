/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package estoque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Ryan Oliveira
 */
public class EstoqueTest {

    public EstoqueTest() {
    }

    Estoque stock = new Estoque();

    
    //ADICIONAR
    
    @Test
    @DisplayName("Teste de Adicionar Produto")
    public void testAdicionarProduto() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.consultarEstoque("Maçã");
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste de Adicionar Não sobrescrever")
    public void testAdicionarProdutoSobrescrever() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.adicionarProduto("Maçã", 10);
        int resultadoEstoque = stock.consultarEstoque("Maçã");
        assertEquals(1, resultado);
        assertEquals(15, resultadoEstoque);
    }

    @Test
    @DisplayName("Teste de Adicionar Produto com valor 0<")
    public void testAdicionarProduto0menos() {
        int resultado = stock.adicionarProduto("Maçã", 0);
        assertEquals(-1, resultado);
    }
    
    
    
    
    
    //REMOVER

    @Test
    @DisplayName("Teste remover produto")
    public void testRemoverProduto() {
        stock.adicionarProduto("Maçã", 5);
        stock.removerProduto("Maçã", 5);
        int resultado = stock.consultarEstoque("Maçã");
        assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Teste remover produto inexistente")
    public void testRemoverProdutoInexistente() {
        int resultado = stock.removerProduto("Maçã", 5);
        assertEquals(-1, resultado);
    }

    @Test
    @DisplayName("Teste remover produto 0<")
    public void testRemoverProduto0menos() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.removerProduto("Maçã", -1);
        assertEquals(-1, resultado);
    }
    
     @Test
    @DisplayName("Teste remover produto quantidade maior")
    public void testRemoverProdutoQuantidadeMaior() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.removerProduto("Maçã", 6);
        assertEquals(1, resultado);
    }
    
    
    
    //CONSULTAR

    @Test
    @DisplayName("Teste consultar estoque")
    public void testConsultarEstoque() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.consultarEstoque("Maçã");
        assertEquals(5, resultado);
    }
    
    @Test
    @DisplayName("Teste consultar estoque inexistente")
    public void testConsultarEstoqueInexistente() {
        stock.adicionarProduto("Maçã", 5);
        int resultado = stock.consultarEstoque("Pera");
        assertEquals(-1, resultado);
    }

}
