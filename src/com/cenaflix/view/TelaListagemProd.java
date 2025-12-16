/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cenaflix.view;

import com.cenaflix.model.dao.PodcastDAO;
import com.cenaflix.model.entity.Podcast;
import com.cenaflix.model.entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel; 
import java.awt.event.KeyAdapter;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
/**
 * Tela principal de listagem de podcasts.
 * Esta tela exibe o catálogo e controla as permissões de acesso
 * baseadas no tipo de usuário logado.
 * @author Cavinho
 */
public class TelaListagemProd extends javax.swing.JFrame {
private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaListagemProd.class.getName());
    
    /**
    * Usuário logado no sistema, utilizado para controlar as permissões.
    */
    private final Usuario usuarioLogado; // Declaração do campo para guardar o usuário

   
    
    /**
    * Construtor principal da tela de listagem.
    * @param usuario O objeto Usuario logado, contendo seu tipo de acesso.
    */
    public TelaListagemProd(Usuario usuario) {
        this.usuarioLogado = usuario;
        initComponents();
        
        this.setLocationRelativeTo(null); // Centraliza a tela
        
        // 1. Aplica as regras de permissão
        aplicarPermissoes();
        
        // 2. Carrega os dados na tabela ao iniciar
        carregarTabela(new PodcastDAO().listarTodos());
        
        // 3. Adiciona o Listener para o filtro
        adicionarListenerFiltro();
        
        // 4. Adiciona ação para o botão Cadastrar
        adicionarAcaoCadastrar();
    }
    
    /**
    * Construtor padrão (somente para o Design View do NetBeans).
    */
    public TelaListagemProd() {
        initComponents();
        this.usuarioLogado = null; // Inicialização segura
        // Se este construtor for usado, as permissões não serão aplicadas
    }
    

    
    // --- LÓGICA DE CARREGAMENTO DE DADOS ---
    private void carregarTabela(List<Podcast> listaPodcasts) {
        // Usa o DefaultTableModel para manipular a JTable
        DefaultTableModel modelo = (DefaultTableModel) TabelaListagem.getModel();
        modelo.setNumRows(0); // Limpa as linhas existentes
        
        for (Podcast p : listaPodcasts) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getProdutor(),
                p.getNomeEpisodio(),
                p.getNumeroEpisodio(),
                p.getDuracao(),
                p.getUrlRepositorio()
            });
        }
    }
    
    // --- LÓGICA DE FILTRO ---
    private void adicionarListenerFiltro() {
        // jTextField1 é o campo de pesquisa por produtor
        txtpesquisaprodutor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String produtor = txtpesquisaprodutor.getText();
                PodcastDAO dao = new PodcastDAO();
                
                // Se o campo estiver vazio, lista todos. Caso contrário, lista por filtro (LIKE)
                List<Podcast> resultados = (produtor.trim().isEmpty()) 
                        ? dao.listarTodos() 
                        : dao.listarPorProdutor(produtor);
                
                carregarTabela(resultados);
            }
        });
    }

    // --- LÓGICA DE NAVEGAÇÃO ---
    private void adicionarAcaoCadastrar() {
        btnCadastrar.addActionListener(e -> {
            // Abre a tela de cadastro e passa a listagem para que possa ser atualizada depois
            TelaCadastroPodcast cadastro = new TelaCadastroPodcast(this);
            cadastro.setVisible(true);
        });
    }

    // Método que deve ser chamado pela TelaCadastroPodcast após um cadastro bem-sucedido
    public void atualizarListagem() {
         carregarTabela(new PodcastDAO().listarTodos());
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListagem = new javax.swing.JTable();
        txtpesquisaprodutor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("CENAFLIX");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("LISTAGEM");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar podcast por produtor");

        TabelaListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produtor", "Nome do Episódio", "Nº Episódio", "Duração", "URL do Repo"
            }
        ));
        jScrollPane1.setViewportView(TabelaListagem);

        txtpesquisaprodutor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisaprodutor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpesquisaprodutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int linhaSelecionada = TabelaListagem.getSelectedRow();

    if (linhaSelecionada >= 0) {
        // 1. OBTEM o ID como Integer (o que o JTable retorna)
        Integer idInteger = (Integer) TabelaListagem.getValueAt(linhaSelecionada, 0); 
        
        // 2. CONVERTE o Integer para Long, que é o tipo que o DAO espera.
        Long idPodcast = idInteger.longValue(); 

        int confirmacao = JOptionPane.showConfirmDialog(null, 
            "Tem certeza que deseja excluir este Podcast?", "Confirmação", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                PodcastDAO dao = new PodcastDAO();
                // 3. CHAMA o DAO com o Long corrigido
                dao.excluir(idPodcast);
                
                JOptionPane.showMessageDialog(null, "Podcast excluído com sucesso!");
                
                // Atualiza a tabela chamando o método com a lista de todos
                carregarTabela(dao.listarTodos()); 
            } catch (Exception ex) {
                logger.severe("Erro ao excluir podcast: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um Podcast para excluir.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed
    /**
    * Aplica as regras de permissão ao inicializar a tela,
    * habilitando/desabilitando botões de Cadastro e Exclusão.
    */
    private void aplicarPermissoes() {
    if (usuarioLogado == null) return; // Segurança caso o construtor padrão seja chamado
    
    // Supondo que o tipo de usuário no banco de dados seja "Administrador", "Operador", ou "Usuario"
    String tipo = usuarioLogado.getTipoUsuario(); 

    // 1. Lógica para o botão CADASTRAR (Operador e Admin podem)
    boolean podeCadastrar = tipo.equalsIgnoreCase("Administrador") || tipo.equalsIgnoreCase("Operador");
    
    // Habilita/Desabilita o botão 'Cadastrar'
    btnCadastrar.setEnabled(podeCadastrar);
    
    // 2. Lógica para o botão EXCLUIR (SOMENTE o Admin pode)
    // Lembre-se que o seu botão "Excluir" foi nomeado pelo NetBeans como jButton1.
    boolean podeExcluir = tipo.equalsIgnoreCase("Administrador");
    
    // Habilita/Desabilita o botão 'Excluir'
    // Garantindo que jButton1 não seja nulo (embora não deva ser, se foi gerado pelo designer)
    if (jButton1 != null) { 
        jButton1.setEnabled(podeExcluir);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaListagem;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtpesquisaprodutor;
    // End of variables declaration//GEN-END:variables
}
