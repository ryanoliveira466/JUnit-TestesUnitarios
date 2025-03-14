# 🎯 **Introdução aos Testes de Software**  

A qualidade do software é essencial para garantir a satisfação dos usuários e evitar problemas críticos. **Os testes de software são uma das principais formas de assegurar que um sistema funciona como esperado**.  

Vamos explorar desde os conceitos básicos até exemplos práticos!  

---

## 🔍 **O que são Testes de Software?**  

Os testes de software são **o processo de avaliar um sistema ou componente para verificar se ele atende aos requisitos especificados e funciona corretamente**.  

Imagine que você vai viajar de carro. Antes de sair, você verifica os pneus, o óleo e os freios. **Isso é um teste!** Você está garantindo que tudo está funcionando corretamente para evitar problemas durante a viagem.  

### 🚦 **Objetivo dos Testes de Software**  

✅ Verificar se o software atende aos requisitos especificados.  
✅ Identificar e corrigir defeitos antes do lançamento.  
✅ Melhorar a confiabilidade e segurança do sistema.  
✅ Garantir uma boa experiência para o usuário final.  

---

## 🎁 **Benefícios dos Testes de Software**  

💡 **Menos custos a longo prazo** – Corrigir erros na fase de desenvolvimento é mais barato do que após o lançamento.  
💡 **Maior satisfação do usuário** – Um software confiável gera confiança.  
💡 **Maior segurança** – Erros podem levar a falhas de segurança, colocando dados em risco.  
💡 **Facilidade na manutenção** – Testes garantem que futuras mudanças não quebrem funcionalidades já existentes.  

---

# 📜 **Principais Conceitos em Testes de Software**  

## 📝 **1. Caso de Teste**  

Um **caso de teste** é um conjunto de **condições e ações** projetadas para verificar se um sistema funciona corretamente.  

🎯 **Exemplo prático em Java:**  
Vamos testar uma função que soma dois números.  

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
```

Agora criamos um **caso de teste** para verificar se a função retorna o valor correto.  

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 + 3 deveria ser 5");
    }
}
```

✅ **Se a função retornar 5, o teste passa. Caso contrário, falha.**  

---

## 📋 **2. Plano de Teste**  

Um **plano de teste** é um **documento que define a estratégia, escopo e recursos necessários para a execução dos testes**.  

🎯 **Analogia**: Imagine que você vai construir uma casa. Antes de começar, você precisa de um **projeto** definindo o que será feito, quais materiais usar, quem trabalhará na obra e os prazos. **O plano de teste é o "projeto" dos testes!**  

---

## ❌ **3. Defeito, Falha e Erro**  

🔸 **Erro** → Um engano cometido pelo programador no código.  
🔸 **Defeito (Bug)** → O erro causa um problema no software.  
🔸 **Falha** → O defeito se manifesta em produção e afeta o usuário.  

🎯 **Exemplo prático:**  
Aqui está um erro simples no código de uma calculadora:  

```java
public class Calculadora {
    public int dividir(int a, int b) {
        return a / b; // O que acontece se b for 0?
    }
}
```

Se o usuário tentar dividir por zero, o programa **falha** e gera uma exceção.  

✅ **Como corrigimos isso?**  
Podemos escrever um teste para capturar o erro:  

```java
@Test
public void testDivisaoPorZero() {
    Calculadora calc = new Calculadora();
    assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0), "Deveria lançar uma exceção ao dividir por zero");
}
```

Agora, sabemos que a função precisa ser corrigida para evitar essa falha.  

---

# 🛠 **Tipos de Teste**  

## 🏗️ **1. Testes Estáticos vs. Testes Dinâmicos**  

🔍 **Testes Estáticos** → São análises feitas sem executar o código. 

✅ Revisão de código.  
✅ Inspeção de requisitos.  
✅ Análise de documentação.  

🚀 **Testes Dinâmicos** → Testam o software **executando o código** para verificar sua funcionalidade.  

✅ Testes unitários.  
✅ Testes de integração.  

🎯 **Exemplo:**  
O código abaixo tem um erro lógico que pode ser identificado por **testes estáticos**.  

```java
public boolean ehPar(int numero) {
    return numero % 2 == 1; // ERRO: deveria ser numero % 2 == 0
}
```

Um **teste dinâmico** pode capturar esse erro:  

```java
@Test
public void testEhPar() {
    assertFalse(ehPar(4), "4 deveria ser par!");
}
```

---

## ⚖️ **2. Teste Caixa-Branca vs. Caixa-Preta**  

🖥️ **Teste Caixa-Branca** → O testador tem acesso ao código-fonte e verifica a lógica interna do programa.  
🎯 **Exemplo:** Testar a lógica de um loop dentro do código.  

🕵️ **Teste Caixa-Preta** → O testador **não** tem acesso ao código-fonte, apenas analisa as entradas e saídas.  
🎯 **Exemplo:** Um usuário testa um formulário de login sem saber como a autenticação é feita internamente.  

---

## 🔬 **3. Tipos de Artefatos de Teste**  

📜 **Principais tipos:** 

📌 **Plano de Teste** → Define o que será testado.  
📌 **Casos de Teste** → Especificam cada cenário de teste.  
📌 **Relatórios de Teste** → Registram os resultados obtidos.  
📌 **Matriz de Rastreabilidade** → Garante que todos os requisitos foram testados.  

🎯 **Exemplo prático:**  

Se um banco lança um novo aplicativo, os artefatos de teste garantirão que todas as funções, como **saques, transferências e pagamentos**, foram validadas antes do lançamento.  

---

# 🏁 **Conclusão**  

✅ Testes de software são fundamentais para garantir a qualidade, segurança e confiabilidade de um sistema.  
✅ Existem diferentes técnicas e abordagens para testar um software.  
✅ O planejamento adequado dos testes reduz falhas e melhora a experiência do usuário.  

---

# 🚀 **Próximos Passos**  

Agora que você aprendeu a teoria e viu exemplos práticos, que tal escrever seus próprios testes? 

No próximo módulo, veremos **como configurar um projeto com JUnit no NetBeans!** 🎯  
