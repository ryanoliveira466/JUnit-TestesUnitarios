### 📚 **Aula sobre Testes Unitários utilizando JUnit no NetBeans** 🖥️

**Objetivo da Aula:**
Hoje vamos entender o que são testes unitários, para que servem e como utilizá-los em nossos projetos Java utilizando a ferramenta JUnit no NetBeans. Ao final, você estará preparado para escrever e rodar testes unitários em seu código!

---

### 1. 🤖 **O que são Testes Unitários?**

**Definição:**

Testes unitários são pequenos testes feitos em partes específicas do código (chamadas de "unidades") para garantir que cada uma delas funciona conforme o esperado.

- **Analogia**: Imagine que você está montando um quebra-cabeça. Antes de juntar as peças, você testa cada uma delas para garantir que está cortada corretamente. Testes unitários fazem isso: testam as partes do código (métodos, funções) para garantir que cada uma delas funciona bem sozinha.

**Por que usar Testes Unitários?**

- ⚙️ **Facilidade de manutenção**: Testes ajudam a garantir que mudanças no código não quebrem funcionalidades antigas.
- 🐞 **Redução de bugs**: Ao testar pequenas partes do sistema, você encontra erros mais facilmente.
- 📑 **Documentação**: Os testes atuam como uma documentação viva do que o código deveria fazer.

---

### 2. 🛠️ **Como Utilizar JUnit em Projetos Java no NetBeans?**

#### 2.1. 🆕 **Criando um Projeto no NetBeans com JUnit**

##### Passo 1: Criar um Novo Projeto

1. Abra o **NetBeans**.
2. Vá até **File > New Project**.
3. Selecione **Java** como categoria e **Java Application** como tipo de projeto.
4. Clique em **Next** e defina o nome do projeto. Vamos chamar o projeto de **TestesJUnitExemplo**.
5. Clique em **Finish** para concluir.

##### Passo 2: Adicionar Dependência do JUnit

Agora, precisamos adicionar o JUnit ao nosso projeto para podermos usá-lo nos testes. Vamos fazer isso usando o **Maven**, que irá gerenciar as dependências para nós.

1. No **NetBeans**, abra o arquivo `pom.xml` que foi criado no projeto.
2. Adicione a dependência do JUnit dentro da tag `<dependencies>`:

```xml
    <dependencies>
        <!-- Dependência do JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>

        <!-- Biblioteca necessária para rodar os testes com JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.0</version>
        </dependency>
    </dependencies>
```

Com isso, o Maven irá baixar e configurar automaticamente a biblioteca JUnit para o seu projeto.

##### Passo 3: Criar a Classe de Teste

Agora, vamos criar a classe principal que queremos testar e depois escrever os testes. 

1. Crie uma classe chamada **Calculadora**:

```java
public class Calculadora {
    // Método que soma dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método que subtrai dois números
    public int subtrair(int a, int b) {
        return a - b;
    }
}
```

2. Agora, crie uma classe de teste chamada **CalculadoraTest**.

Para isso, clique com o botão direito na pasta **Test Packages** e selecione **New > JUnit Test**. Escolha a classe **Calculadora** para ser testada.

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 4);
        assertEquals(7, resultado, "A soma de 3 e 4 deve ser 7");
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(5, 2);
        assertEquals(3, resultado, "A subtração de 5 e 2 deve ser 3");
    }
}
```

**Explicação:**

- `@Test`: Define que o método abaixo é um teste.
- `assertEquals(valorEsperado, valorObtido)`: Compara o valor obtido com o valor esperado.
- A string `"A soma de 3 e 4 deve ser 7"` aparece se o teste falhar.

##### Passo 4: Rodando os Testes
Para rodar os testes, basta clicar com o botão direito na classe **CalculadoraTest** e selecionar **Run File**. O NetBeans irá compilar e rodar os testes automaticamente.

---

### 3. 🧑‍💻 **Exemplo Prático de Teste com JUnit**

Agora, vamos adicionar alguns **erros lógicos** no código para que os alunos possam identificar e corrigir usando os testes unitários.

**Código com Erros:**

```java
public class Calculadora {

    // Método de multiplicação com erro
    public int multiplicar(int a, int b) {
        return a + b;  // ERRO: deveria ser a * b
    }

    // Método de divisão com erro
    public int dividir(int a, int b) {
        if (b == 0) {
            return 0;  // ERRO: deveria lançar uma exceção, não retornar 0
        }
        return a / b;
    }
}
```

Agora, vamos escrever os testes para pegar esses erros:

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 4);
        assertEquals(12, resultado, "A multiplicação de 3 e 4 deve ser 12");
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        assertEquals(5, resultado, "A divisão de 10 por 2 deve ser 5");
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 0);
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0), "Deveria lançar uma exceção ao dividir por zero");
    }
}
```

**Alterações e Explicações:**

- O teste `testMultiplicar()` verifica a multiplicação, mas o código está errado, pois a operação no método `multiplicar` usa `+` ao invés de `*`.
- O teste `testDividirPorZero()` agora verifica se a divisão por zero gera a exceção correta (que deve ser lançada, mas no código original é apenas retornado 0).

**Rodando os Testes:**
Quando você rodar os testes no NetBeans, verá que os testes de multiplicação e divisão por zero falham. Isso é esperado, pois há erros no código que precisam ser corrigidos.

### 🚀 **Exercício Prático: Testes Unitários no JUnit** 📝

Agora que você aprendeu o básico sobre testes unitários com JUnit, chegou a hora de colocar a mão na massa!

**Objetivo**: Identificar e corrigir erros em uma aplicação Java utilizando testes unitários.

---

### 🧩 **Enunciado do Exercício**

1. **Código com Erros**: Abaixo está o código de uma aplicação simples, uma classe `Calculadora`, com alguns erros de lógica. Seu objetivo é identificar esses erros e criar os testes unitários para validá-los.

2. **Tarefa**:
   - Crie os testes unitários necessários para verificar se os métodos da classe `Calculadora` estão funcionando corretamente.
   - Identifique e corrija os erros no código com base nos resultados dos testes.

---

### 🧑‍💻 **Código com Erros**: (A classe `Calculadora`)

```java
public class Calculadora {

    // Método que soma dois números
    public int somar(int a, int b) {
        return a - b;  // ERRO: deveria ser a + b
    }

    // Método que subtrai dois números
    public int subtrair(int a, int b) {
        return a + b;  // ERRO: deveria ser a - b
    }

    // Método que multiplica dois números
    public int multiplicar(int a, int b) {
        return a + b;  // ERRO: deveria ser a * b
    }

    // Método que divide dois números
    public int dividir(int a, int b) {
        if (b == 0) {
            return 0;  // ERRO: deveria lançar uma exceção
        }
        return a / b;
    }
}
```

### **Passos para Resolver:**

1. **Crie a classe de teste**:
   - Crie uma classe chamada `CalculadoraTest`.
   - Escreva métodos de teste para os métodos `somar()`, `subtrair()`, `multiplicar()` e `dividir()`.
   
2. **Corrija os erros**:
   - Após rodar os testes, identifique os erros de lógica no código da classe `Calculadora` e corrija-os para que os testes passem.

3. **Teste a divisão por zero**:
   - O método `dividir()` precisa lançar uma exceção (como `ArithmeticException`) quando a divisão for por zero. Isso deve ser verificado e corrigido no teste.

---

### 🔍 **Dica para o Teste de Divisão por Zero**

Para testar a divisão por zero, você pode utilizar o método `assertThrows()` do JUnit, como foi mostrado na aula.

```java
@Test
public void testDividirPorZero() {
    Calculadora calc = new Calculadora();
    assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0), "Deveria lançar uma exceção ao dividir por zero");
}
```

---

### 🏁 **Critérios de Aceitação**:

- Todos os métodos de teste devem passar quando rodados.
- A classe `Calculadora` deve ser corrigida para funcionar corretamente.
- O código de testes deve ser executado sem erros e sem falhas.
