package br.com.cenaflix.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
    /**
    * Utilitário responsável por criar e gerenciar o EntityManagerFactory e o EntityManager
    * para o JPA (Hibernate).
     */
public class JPAUtil {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("CenaflixPU");
    /**
     * Retorna uma nova instância de EntityManager para interagir com o banco de dados.
     * @return EntityManager pronto para uso.
     */
    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}