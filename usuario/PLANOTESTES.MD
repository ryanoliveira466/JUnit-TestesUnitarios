# Objetivos

* Sistema de cadastro de usuários: Permitir o cadastro de usuários com nome, email e senha, garantindo que o email seja válido e a senha tenha pelo menos 8 caracteres.

✔️Criar usuário.

✔️Senha maior do que 8 caracteres.

✔️Email com provedor válido.

---

# 📍 1. Introdução
Há duas classes no sistema

```Java
User
```

&

```Java
Register
```

**User**: Classe onde é criado o objeto com Nome, Senha e E-mail.

**Register**: Onde vai ser filtrado os dados para serem criados os usuários.

---

# 📋  Casos de Teste (Test Cases)
Um caso de teste especifica um cenário a ser testado, incluindo as entradas, saídas esperadas e critérios de aprovação.

## 📜 Casos de Teste - Registro Usuários

### Caso de Teste 1 - Cadastro de Usuário com todos os dados corretos
ID	CT001
| ID     | CT001
|-----------|----
| Descrição      | Testar o registro dos usuários
| Dados de entrada   | Nome: Ryan, E-mail: ryan@gmail.com, Senha: 12345678
|Saída Esperada | 1 & Log dos Usuários
|Status | ✅


### Caso de Teste 2 - Cadastro de Usuário com email CAPSLOCK
ID	CT002
| ID     | CT002
|-----------|----
| Descrição      | Testar o registro dos usuários com o email em CAPSLOCK
| Dados de entrada   | Nome: Ryan, E-mail: ryan@GMAIL.COM, Senha: 12345678
|Saída Esperada | 1 & Log dos Usuários
|Status | ✅

### Caso de Teste 3 - Cadastro de Usuário sem provedor de E-mail
ID	CT003
| ID     | CT003
|-----------|----
| Descrição      | Testar o registro dos usuários sem o provedor de E-mail
| Dados de entrada   | Nome: Ryan, E-mail: ryan, Senha: 12345678
|Saída Esperada | -1 & Mensagem de erro sobre o provedor
|Status | ✅

### Caso de Teste 4 - Cadastro de Usuário com senha com menos de 8 caracteres
ID	CT004
| ID     | CT004
|-----------|----
| Descrição      | Testar o registro dos usuários com senha com menos de 8 caracteres
| Dados de entrada   | Nome: Ryan, E-mail: ryan@gmail.com, Senha: 1234567
|Saída Esperada | -2 & Mensagem de erro sobre a senha
|Status | ✅

### Caso de Teste 5 - Cadastro de Usuário nome vazio ou com espaços
ID	CT005
| ID     | CT005
|-----------|----
| Descrição      | Testar o registro dos usuários com nome vazio
| Dados de entrada   | Nome: "  ", E-mail: ryan@gmail.com, Senha: 12345678
|Saída Esperada | -3 & Mensagem de erro sobre nome
|Status | ✅

---

# 🔗 Matriz de Rastreabilidade
A **Matriz de Rastreabilidade** garante que cada requisito do sistema tenha um caso de teste correspondente.

## 📜 Matriz de Rastreabilidade - Registro Usuários

| Requisito                        | Caso de Teste | Status         |
|----------------------------------|--------------|---------------|
| RF001 - Cadastro de Usuário com todos os dados corretos     | CT001        | ✅ Aprovado   |
| RF002 - Cadastro de Usuário com email CAPSLOCK                   | CT002        | ✅ Aprovado   |
| RF003 - Caso de Teste 3 - Cadastro de Usuário sem provedor de E-mail  | CT003        | ✅ Aprovado     |
| RF004 - Caso de Teste 4 - Cadastro de Usuário com senha com menos de 8 caracteres       | CT004        | ✅ Aprovado    |
| RF004 - Caso de Teste 5 - Cadastro de Usuário nome vazio       | CT005        | ✅ Aprovado    |