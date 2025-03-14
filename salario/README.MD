### **Cálculo de Salário e Descontos com Base no Cargo**

#### **Requisitos:**
- Criar uma **enumeração `Cargo`** com os seguintes valores: `DESENVOLVEDOR`, `DBA` e `TESTADOR`.
- Criar uma **classe `Funcionario`** com os seguintes atributos:
  - `private String nome;`
  - `private double salario;`
  - `private Cargo cargo;`
- **Regras de desconto:**
  - **Desenvolvedores:**  
    - 20% de desconto para salários acima de R$ 3000,00.  
    - 10% para salários menores ou iguais a R$ 3000,00.  
  - **DBAs e Testadores:**  
    - 25% de desconto para salários acima de R$ 2500,00.  
    - 15% para salários menores ou iguais a R$ 2500,00.  

- Implementar **testes unitários com JUnit** para validar as regras de negócio.