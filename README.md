# 🎬 Cenaflix CRUD Podcast

Projeto desenvolvido em Java utilizando o padrão CRUD (Create, Read, Update, Delete) para gerenciamento de um catálogo de Podcasts.

Este projeto utiliza JPA (Hibernate) para persistência de dados e a interface gráfica foi construída com Swing (NetBeans Design View).

## ✨ Funcionalidades

* **Autenticação de Usuário:** Login com diferentes níveis de acesso (`Administrador`, `Operador`, `Usuário`).
* **Controle de Acesso (RBAC):**
    * `Administrador`: Pode Listar, Cadastrar e Excluir.
    * `Operador`: Pode Listar e Cadastrar.
    * `Usuário`: Pode Apenas Listar.
* **CRUD de Podcasts:** Cadastro, Visualização (Listagem) e Exclusão de registros.
* **Pesquisa Dinâmica:** Filtro em tempo real por nome do Produtor.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Persistência:** JPA (Hibernate)
* **Banco de Dados:** MySQL / MariaDB
* **Interface:** Swing (javax.swing)
* **Build Tool:** Apache Ant (padrão NetBeans)

## 🚀 Como Executar o Projeto

### Pré-requisitos

1.  Java Development Kit (JDK 17 ou superior)
2.  MySQL Server ou MariaDB instalado e rodando.
3.  Um IDE compatível (NetBeans recomendado).

### 1. Configuração do Banco de Dados

1.  Crie um banco de dados vazio chamado `cenaflixdb`.
2.  Configure as credenciais do banco de dados no arquivo `persistence.xml` (geralmente localizado em `src/META-INF/persistence.xml`).

    ```xml
    <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/cenaflixdb?useTimezone=true&serverTimezone=UTC"/>
    <property name="jakarta.persistence.jdbc.user" value="seu_usuario_bd"/>
    <property name="jakarta.persistence.jdbc.password" value="sua_senha_bd"/>
    <property name="hibernate.hbm2ddl.auto" value="update"/>
    ```

### 2. Rodar a Aplicação

1.  Abra o projeto no NetBeans.
2.  Execute a classe principal que contém o método `main()` (provavelmente a `TelaLogin.java`).
3.  **Usuários Iniciais:** Se o seu banco estiver vazio, o Hibernate criará as tabelas. Você deve inserir manualmente os usuários de teste na tabela `tb_usuario`:

    | Login | Senha | Tipo_Usuario |
    | :--- | :--- | :--- |
    | admin | admin | Administrador |
    | operador | operador | Operador |
    | usuario | usuario | Usuario |

## 📦 Estrutura do Projeto
## ✒️ Autor

* [Rodrigo Cavicchioli / rodrigocav]
