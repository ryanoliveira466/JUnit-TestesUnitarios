# 📝 **Annotations no JUnit – O que são e como usar?**  

No JUnit, utilizamos **anotações** para indicar ao framework como os testes devem ser executados. Essas anotações definem métodos de inicialização, execução e finalização de testes.  

Aqui estão as principais anotações:  

| Anotação | Descrição | Quando usar? |
|----------|-------------|-------------|
| **@Test** | Indica que um método é um caso de teste. | Em todos os métodos de teste. |
| **@BeforeAll** | Executa um método **antes de todos os testes** (precisa ser `static`). | Para inicializar recursos antes dos testes começarem. |
| **@AfterAll** | Executa um método **após todos os testes** (precisa ser `static`). | Para limpar recursos depois que os testes terminam. |
| **@BeforeEach** | Executa um método **antes de cada teste individual**. | Para resetar o estado antes de cada teste. |
| **@AfterEach** | Executa um método **depois de cada teste individual**. | Para liberar recursos após cada teste. |
| **@Disabled** | Desabilita temporariamente um teste. | Quando um teste está em manutenção ou ainda não implementado. |
| **@DisplayName** | Define um nome descritivo para o teste. | Para melhorar a legibilidade dos testes. |
| **@RepeatedTest(n)** | Repete a execução de um teste `n` vezes. | Para validar comportamento em execuções repetidas. |

---  

## 🚀 **Exemplo Prático com Anotações JUnit**  

Vamos criar um **teste unitário para um sistema de contas bancárias**, utilizando todas essas anotações.  

### 📌 **Código da Classe ContaBancaria**  

```java
public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

---

### 📌 **Criando Testes com JUnit**  

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Define que o ciclo de vida é por classe
public class ContaBancariaTest {
    private ContaBancaria conta;

    @BeforeAll
    static void iniciarTestes() {
        System.out.println("🚀 Iniciando os testes...");
    }

    @BeforeEach
    void configurarTeste() {
        conta = new ContaBancaria(1000); // Antes de cada teste, cria-se uma nova conta com saldo inicial de R$1000
        System.out.println("🔄 Configuração concluída.");
    }

    @Test
    @DisplayName("💰 Depósito bem-sucedido")
    void testDeposito() {
        conta.depositar(500);
        assertEquals(1500, conta.getSaldo(), "O saldo deveria ser 1500 após o depósito.");
    }

    @Test
    @DisplayName("💸 Saque bem-sucedido")
    void testSaque() {
        boolean resultado = conta.sacar(300);
        assertTrue(resultado, "O saque deveria ser permitido.");
        assertEquals(700, conta.getSaldo(), "O saldo deveria ser 700 após o saque.");
    }

    @Test
    @DisplayName("🚫 Saque inválido (saldo insuficiente)")
    void testSaqueInvalido() {
        boolean resultado = conta.sacar(2000);
        assertFalse(resultado, "O saque não deveria ser permitido.");
        assertEquals(1000, conta.getSaldo(), "O saldo deveria permanecer inalterado.");
    }

    @AfterEach
    void limparTeste() {
        System.out.println("✅ Teste finalizado.");
    }

    @AfterAll
    static void finalizarTestes() {
        System.out.println("🏁 Todos os testes concluídos.");
    }
}
```

---

# 🎯 **Assertions (Métodos de Asserção) no JUnit**  

Os **métodos de asserção** são usados para verificar se um resultado esperado corresponde ao obtido.  

### **Principais Métodos de Asserção**  

| Método | Descrição | Exemplo |
|--------|----------|---------|
| `assertEquals(expected, actual)` | Verifica se os valores são iguais. | `assertEquals(100, saldo);` |
| `assertNotEquals(expected, actual)` | Verifica se os valores são diferentes. | `assertNotEquals(200, saldo);` |
| `assertTrue(condition)` | Verifica se a condição é verdadeira. | `assertTrue(conta.sacar(50));` |
| `assertFalse(condition)` | Verifica se a condição é falsa. | `assertFalse(conta.sacar(5000));` |
| `assertNull(object)` | Verifica se um objeto é `null`. | `assertNull(cliente.getEndereco());` |
| `assertNotNull(object)` | Verifica se um objeto **não** é `null`. | `assertNotNull(cliente.getNome());` |
| `assertThrows(Exception.class, () -> blocoDeCodigo)` | Verifica se um erro específico é lançado. | `assertThrows(IllegalArgumentException.class, () -> metodoQueLancaErro());` |

---

### 📌 **Exemplo Prático com Vários Assertions**  

```java
@Test
@DisplayName("🚀 Testando múltiplos assertions")
void testMultiplosAssertions() {
    ContaBancaria conta = new ContaBancaria(1000);

    assertAll("Testando Conta Bancária",
        () -> assertEquals(1000, conta.getSaldo(), "Saldo inicial deve ser 1000"),
        () -> assertNotNull(conta, "A conta não pode ser nula"),
        () -> assertTrue(conta.sacar(500), "O saque de 500 deve ser bem-sucedido"),
        () -> assertEquals(500, conta.getSaldo(), "Após saque, saldo deve ser 500"),
        () -> assertFalse(conta.sacar(1000), "O saque de 1000 deve falhar"),
        () -> assertEquals(500, conta.getSaldo(), "Saldo deve permanecer 500 após saque falhado")
    );
}
```

---

# 🔄 **Testes Parametrizados com JUnit**  

Às vezes, queremos rodar o **mesmo teste com diferentes valores**. Podemos usar **@ParameterizedTest** para isso.  

### 📌 **Exemplo de Teste Parametrizado**  

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ContaBancariaTest {

    @ParameterizedTest
    @ValueSource(doubles = {100, 200, 300})
    @DisplayName("🤑 Testando depósitos com valores variados")
    void testDepositos(double valor) {
        ContaBancaria conta = new ContaBancaria(1000);
        conta.depositar(valor);
        assertTrue(conta.getSaldo() >= 1000, "O saldo deve ser atualizado corretamente.");
    }
}
```

---

# 🏁 **Conclusão**  

🔹 **Anotações JUnit** ajudam a estruturar e organizar testes.  
🔹 **Assertions** garantem que os resultados esperados sejam alcançados.  
🔹 **Testes parametrizados** evitam repetição de código e aumentam a cobertura de testes.  

Agora que dominamos os conceitos, podemos seguir para a **automatização e relatórios de testes!** 🚀
