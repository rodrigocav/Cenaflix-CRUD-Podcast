package com.cenaflix.model.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade que mapeia os dados de um Usuário para a tabela tb_usuario,
 * utilizada para controle de login e permissões.
 */
@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** ID único do usuário. */
    private Integer id;

    @Column(nullable = false)
    /** Login (nome de usuário) do usuário. */
    private String login;

    @Column(nullable = false)
    /** Senha do usuário. */
    private String senha;

    @Column(name = "tipo_usuario", nullable = false)
    /** Tipo de permissão (ex: Administrador, Operador, Usuario). */
    private String tipoUsuario; 

    /** Construtor padrão exigido pelo JPA. */
    public Usuario() {}
    
    /** * Construtor para criar novos usuários.
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @param tipoUsuario Tipo de permissão.
     */
    public Usuario(String login, String senha, String tipoUsuario) {
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    
    // Getters e Setters corrigidos para Javadoc
    
    /** * Obtém o ID do usuário.
     * @return O ID (chave primária) do usuário.
     */
    public Integer getId() { return id; }

    /** * Define o ID do usuário.
     * @param id Novo ID.
     */
    public void setId(Integer id) { this.id = id; }

    /** * Obtém o login do usuário.
     * @return O login (nome de usuário).
     */
    public String getLogin() { return login; }

    /** * Define o login do usuário.
     * @param login Novo login.
     */
    public void setLogin(String login) { this.login = login; }

    /** * Obtém a senha do usuário.
     * @return A senha.
     */
    public String getSenha() { return senha; }

    /** * Define a senha do usuário.
     * @param senha Nova senha.
     */
    public void setSenha(String senha) { this.senha = senha; }

    /** * Obtém o tipo de permissão do usuário.
     * @return O tipo de permissão (Ex: Administrador).
     */
    public String getTipoUsuario() { return tipoUsuario; }

    /** * Define o tipo de permissão do usuário.
     * @param tipoUsuario Novo tipo de permissão.
     */
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}