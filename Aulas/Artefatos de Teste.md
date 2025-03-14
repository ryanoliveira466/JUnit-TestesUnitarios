# 🏦 **Artefatos de Teste para um Aplicativo Bancário**  

Imagine que uma equipe de desenvolvimento está criando um **app bancário** que permite:  

✅ Criar conta  
✅ Fazer login  
✅ Realizar transferências  
✅ Consultar saldo  

**Nosso objetivo é criar os artefatos de teste necessários para garantir que o sistema funcione corretamente.**  

---

# 📌 **1. Plano de Teste** (Test Plan)  

O **Plano de Teste** é um documento que descreve a estratégia para testar o sistema, incluindo o que será testado, como será testado e os critérios de sucesso.  

## 📜 **Plano de Teste - Aplicativo Bancário**  

### 📍 **1. Introdução**  

Este documento descreve os testes necessários para validar o funcionamento do aplicativo bancário.  

### 📍 **2. Escopo**  

Serão testadas as funcionalidades de:  

- Cadastro de usuários  
- Login e autenticação  
- Transferências bancárias  
- Consulta de saldo  

### 📍 **3. Estratégia de Teste**  

O plano inclui **testes funcionais, de segurança e de desempenho**, usando **JUnit para testes automatizados** e **testes manuais para a interface gráfica**.  

### 📍 **4. Ferramentas Utilizadas**  

- **JUnit** para testes unitários  
- **Selenium** para testes de interface  
- **Postman** para testes de API  

### 📍 **5. Critérios de Sucesso**  

O sistema será considerado aprovado se:  

✅ Todos os testes funcionais forem bem-sucedidos.  
✅ O tempo de resposta for menor que 2 segundos.  
✅ Nenhum dado for perdido em operações de transferência.  

---

# 📋 **2. Casos de Teste** (Test Cases)  

Um **caso de teste** especifica um cenário a ser testado, incluindo as entradas, saídas esperadas e critérios de aprovação.  

## 📜 **Casos de Teste - Aplicativo Bancário**  

### **Caso de Teste 1 - Cadastro de Usuário**  
| ID | CT001 |
|----|-------|
| **Descrição** | Testar se o usuário consegue se cadastrar com sucesso. |
| **Passos** | 1. Acessar a tela de cadastro<br>2. Preencher nome, e-mail e senha<br>3. Confirmar cadastro |
| **Dados de Entrada** | Nome: João Silva, E-mail: joao@email.com, Senha: 123456 |
| **Saída Esperada** | Conta criada com sucesso. |
| **Status** | ✅ Aprovado |

### **Caso de Teste 2 - Transferência Bancária**  
| ID | CT002 |
|----|-------|
| **Descrição** | Verificar se a transferência entre contas é realizada corretamente. |
| **Passos** | 1. Usuário A acessa a conta<br>2. Digita a conta de destino e valor<br>3. Confirma a transferência |
| **Dados de Entrada** | Conta Origem: 123, Conta Destino: 456, Valor: R$100,00 |
| **Saída Esperada** | Saldo da conta de origem reduzido em R$100,00 e conta de destino aumentada em R$100,00. |
| **Status** | 🔄 Em andamento |

---

# 📊 **3. Relatório de Teste** (Test Report)  

O **Relatório de Teste** documenta os resultados da execução dos testes.  

## 📜 **Relatório de Teste - Aplicativo Bancário**  

| Caso de Teste | Status | Observações |
|--------------|--------|-------------|
| **CT001 - Cadastro de Usuário** | ✅ Aprovado | Funcionou corretamente. |
| **CT002 - Transferência Bancária** | ❌ Falhou | Transferência não descontou saldo corretamente. |
| **CT003 - Login** | ✅ Aprovado | Autenticação bem-sucedida. |

### **Resumo**  

- **Total de testes:** 3  
- **Testes aprovados:** 2  
- **Testes falhos:** 1  

📌 **Correção necessária:** Verificar a lógica de desconto do saldo na transferência.  

---

# 🔗 **4. Matriz de Rastreabilidade**  

A **Matriz de Rastreabilidade** garante que cada requisito do sistema tenha um caso de teste correspondente.  

## 📜 **Matriz de Rastreabilidade - Aplicativo Bancário**  

| Requisito | Caso de Teste | Status |
|-----------|-------------|--------|
| **RF001** - Cadastro de usuário | **CT001** | ✅ Aprovado |
| **RF002** - Login | **CT003** | ✅ Aprovado |
| **RF003** - Transferência bancária | **CT002** | ❌ Falhou |
| **RF004** - Consulta de saldo | **CT004** | 🔄 Em andamento |

✅ **O requisito RF003 precisa ser revisado, pois o teste CT002 falhou!**  

---

# 📌 **Exemplo de Código Java - Testando Transferência Bancária**  

Vamos escrever um **teste automatizado** para validar a funcionalidade de transferência.  

### 📜 **Código da Classe Banco**  

```java
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean transferir(Banco destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

### 📜 **Código de Teste com JUnit**  

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BancoTest {
    @Test
    public void testTransferencia() {
        Banco contaOrigem = new Banco(500);
        Banco contaDestino = new Banco(200);

        boolean sucesso = contaOrigem.transferir(contaDestino, 100);

        assertTrue(sucesso, "Transferência deveria ser bem-sucedida");
        assertEquals(400, contaOrigem.getSaldo(), "Saldo incorreto na conta de origem");
        assertEquals(300, contaDestino.getSaldo(), "Saldo incorreto na conta de destino");
    }

    @Test
    public void testTransferenciaSaldoInsuficiente() {
        Banco contaOrigem = new Banco(50);
        Banco contaDestino = new Banco(200);

        boolean sucesso = contaOrigem.transferir(contaDestino, 100);

        assertFalse(sucesso, "Transferência deveria falhar por saldo insuficiente");
        assertEquals(50, contaOrigem.getSaldo(), "Saldo incorreto na conta de origem");
        assertEquals(200, contaDestino.getSaldo(), "Saldo incorreto na conta de destino");
    }
}
```

✅ **O primeiro teste verifica se a transferência foi realizada corretamente.**  
✅ **O segundo teste verifica se a transferência falha quando o saldo é insuficiente.**  

---

# 🏁 **Conclusão**  

🔹 Criamos **todos os artefatos de teste necessários** para validar o aplicativo bancário.  
🔹 Implementamos **testes automatizados com JUnit** para garantir que as transferências funcionem corretamente.  
🔹 **Testes falhos indicam pontos que precisam ser corrigidos** antes do lançamento do sistema.  
