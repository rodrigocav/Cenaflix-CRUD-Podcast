-- 1. CRIAÇÃO DO BANCO DE DADOS
-- O nome do banco DEVE ser o mesmo configurado no persistence.xml ("cenaflix_db")
CREATE DATABASE IF NOT EXISTS cenaflix_db;
USE cenaflix_db;

-- 2. CRIAÇÃO DA TABELA DE USUÁRIOS
-- Esta tabela armazena as credenciais e o tipo de permissão para o login.
-- Nota: A coluna 'tipo_usuario' armazena as strings: 'Administrador', 'Operador', 'Usuario'.
CREATE TABLE IF NOT EXISTS tb_usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL,
    tipo_usuario VARCHAR(20) NOT NULL
);

-- 3. CRIAÇÃO DA TABELA DE PODCASTS
-- Esta tabela armazena os dados do repositório de podcasts.
-- O JPA (Hibernate) irá gerenciar esta tabela automaticamente,
-- mas é bom tê-la no script.
CREATE TABLE IF NOT EXISTS tb_podcast (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produtor VARCHAR(100) NOT NULL,
    nome_episodio VARCHAR(255) NOT NULL,
    numero_episodio INT NOT NULL,
    duracao VARCHAR(10) NOT NULL,
    url_repositorio VARCHAR(255) NOT NULL
);

-- 4. INSERÇÃO DOS USUÁRIOS INICIAIS DE TESTE
-- Estes usuários são obrigatórios para testar o controle de permissão (Admin, Operador, Usuário).
INSERT INTO tb_usuario (login, senha, tipo_usuario) VALUES
-- Login: admin / Senha: admin | Permissão: cadastrar, excluir, listar
('admin', 'admin', 'Administrador'), 
-- Login: operador / Senha: operador | Permissão: cadastrar, listar
('operador', 'operador', 'Operador'), 
-- Login: usuario / Senha: usuario | Permissão: listar
('usuario', 'usuario', 'Usuario'); 

-- 5. CONSULTA DE VERIFICAÇÃO (Opcional)
SELECT * FROM tb_usuario;