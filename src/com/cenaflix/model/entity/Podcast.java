package com.cenaflix.model.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidade que mapeia os dados de um Podcast para a tabela tb_podcast no banco de dados.
 */
@Entity
@Table(name = "tb_podcast")
public class Podcast implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** ID único do podcast (chave primária). */
    private Integer id;

    @Column(nullable = false)
    /** Nome do produtor do podcast. */
    private String produtor;

    @Column(name = "nome_episodio", nullable = false)
    /** Título do episódio. */
    private String nomeEpisodio;

    @Column(name = "numero_episodio", nullable = false)
    /** Número sequencial do episódio. */
    private Integer numeroEpisodio;

    @Column(nullable = false)
    /** Duração do episódio, mantida como String (ex: "01:30:00"). */
    private String duracao; 

    @Column(name = "url_repositorio", nullable = false)
    /** URL do repositório onde o podcast está hospedado. */
    private String urlRepositorio;

    /** Construtor padrão exigido pelo JPA. */
    public Podcast() {}
    
    /** * Construtor completo para criação de novos podcasts.
     * @param produtor Nome do produtor.
     * @param nomeEpisodio Nome do episódio.
     * @param numeroEpisodio Número do episódio.
     * @param duracao Duração do episódio.
     * @param urlRepositorio URL do repositório.
     */
    public Podcast(String produtor, String nomeEpisodio, Integer numeroEpisodio, String duracao, String urlRepositorio) {
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.numeroEpisodio = numeroEpisodio;
        this.duracao = duracao;
        this.urlRepositorio = urlRepositorio;
    }
    
    // Getters e Setters corrigidos
    
    /** * Obtém o ID do podcast.
     * @return O ID (chave primária) do podcast.
     */
    public Integer getId() { return id; }

    /** * Define o ID do podcast.
     * @param id Novo ID.
     */
    public void setId(Integer id) { this.id = id; }

    /** * Obtém o produtor do podcast.
     * @return O nome do produtor.
     */
    public String getProdutor() { return produtor; }

    /** * Define o produtor do podcast.
     * @param produtor Novo nome do produtor.
     */
    public void setProdutor(String produtor) { this.produtor = produtor; }

    /** * Obtém o nome do episódio.
     * @return O título do episódio.
     */
    public String getNomeEpisodio() { return nomeEpisodio; }

    /** * Define o nome do episódio.
     * @param nomeEpisodio Novo título do episódio.
     */
    public void setNomeEpisodio(String nomeEpisodio) { this.nomeEpisodio = nomeEpisodio; }

    /** * Obtém o número do episódio.
     * @return O número sequencial do episódio.
     */
    public Integer getNumeroEpisodio() { return numeroEpisodio; }

    /** * Define o número do episódio.
     * @param numeroEpisodio Novo número.
     */
    public void setNumeroEpisodio(Integer numeroEpisodio) { this.numeroEpisodio = numeroEpisodio; }

    /** * Obtém a duração.
     * @return A duração do episódio como String.
     */
    public String getDuracao() { return duracao; }

    /** * Define a duração.
     * @param duracao Nova duração.
     */
    public void setDuracao(String duracao) { this.duracao = duracao; }

    /** * Obtém a URL do repositório.
     * @return A URL do repositório.
     */
    public String getUrlRepositorio() { return urlRepositorio; }

    /** * Define a URL do repositório.
     * @param urlRepositorio Nova URL.
     */
    public void setUrlRepositorio(String urlRepositorio) { this.urlRepositorio = urlRepositorio; }
}