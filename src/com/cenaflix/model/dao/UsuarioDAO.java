package com.cenaflix.model.dao;

import com.cenaflix.model.entity.Usuario;
import br.com.cenaflix.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

/**
 * Camada de acesso a dados (DAO) para a entidade Usuario.
 * Responsável pela autenticação e persistência de usuários.
 */
public class UsuarioDAO {
    
    /** Construtor padrão. */
    public UsuarioDAO() {}

    /**
     * Busca um usuário pelo login e senha para autenticação.
     * @param login O login fornecido pelo usuário.
     * @param senha A senha fornecida pelo usuário.
     * @return O objeto Usuario se as credenciais estiverem corretas, ou null caso contrário.
     */
    public Usuario buscarPorLoginESenha(String login, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        Usuario usuario = null;
        try {
            String jpql = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            
            usuario = query.getSingleResult();
        } catch (NoResultException e) {
            // Retorna null se não encontrar o usuário
            usuario = null;
        } finally {
            em.close();
        }
        return usuario;
    }
    
    /**
     * Salva um novo usuário no banco de dados.
     * @param u O objeto Usuario a ser persistido.
     */
    public void salvar(Usuario u) {
        try (EntityManager em = JPAUtil.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        }
    }
}