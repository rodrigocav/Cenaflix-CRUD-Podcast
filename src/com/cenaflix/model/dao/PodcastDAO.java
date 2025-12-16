package com.cenaflix.model.dao;

import com.cenaflix.model.entity.Podcast;
import br.com.cenaflix.util.JPAUtil; 
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/**
 * Camada de acesso a dados (DAO) para a entidade Podcast.
 * Responsável por todas as operações CRUD relacionadas a podcasts.
 */
public class PodcastDAO {

    /** Construtor padrão. */
    public PodcastDAO() {}
    
    /**
     * Salva ou atualiza um Podcast no banco de dados.
     * @param podcast A entidade Podcast a ser persistida.
     */
    public void salvar(Podcast podcast) {
        try (EntityManager em = JPAUtil.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();
        }
    }
    
    /**
     * Remove um Podcast do banco de dados pelo seu ID.
     * @param id O ID do podcast a ser excluído.
     */
    public void excluir(Long id) {
        try (EntityManager em = JPAUtil.getEntityManager()) {
            em.getTransaction().begin();
            
            // 1. Encontrar o objeto pelo ID
            Podcast podcastParaRemover = em.find(Podcast.class, id);
            
            if (podcastParaRemover != null) {
                // 2. Remover a entidade
                em.remove(podcastParaRemover);
            }
            
            em.getTransaction().commit();
        }
    }

    /**
     * Lista todos os podcasts presentes no banco de dados, ordenados pelo ID.
     * @return Uma lista de objetos Podcast.
     */
    public List<Podcast> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Podcast> podcasts = null;
        try {
            String jpql = "SELECT p FROM Podcast p ORDER BY p.id DESC";
            TypedQuery<Podcast> query = em.createQuery(jpql, Podcast.class);
            podcasts = query.getResultList();
        } finally {
            em.close();
        }
        return podcasts;
    }

    /**
     * Lista podcasts filtrados pelo nome do produtor (usando LIKE).
     * @param produtor A string de pesquisa para o produtor.
     * @return Uma lista de objetos Podcast que correspondem ao filtro.
     */
    public List<Podcast> listarPorProdutor(String produtor) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Podcast> podcasts = null;
        try {
            String jpql = "SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor ORDER BY p.id";
            TypedQuery<Podcast> query = em.createQuery(jpql, Podcast.class);
            query.setParameter("produtor", "%" + produtor + "%"); 
            podcasts = query.getResultList();
        } finally {
            em.close();
        }
        return podcasts;
    }
}